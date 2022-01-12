public static void main(java.lang.String[] args) {
    if ((args.length) == 0) {
        java.lang.System.out.println("Usage: java -jar MSM.jar FILE_NAME");
        java.lang.System.exit(1);
    }
    java.lang.String csvPath = args[0];
    java.util.ArrayList<seng3011.msm.TradeRec> tradeRecs = seng3011.msm.CSVParser.CSVParse(csvPath);
    seng3011.msm.GenerateOrder strategy = new seng3011.msm.GenerateOrder();
    java.util.ArrayList<seng3011.msm.SellOrder> sellOrders = strategy.generate(tradeRecs);
    java.lang.System.out.println("Proceess finished. Please check output files.");
}