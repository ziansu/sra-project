private void parseBuyerTimes(java.lang.String buyerList) {
    try {
        java.io.File buyer_file = new java.io.File(buyerList);
        java.util.Scanner buyer_scanner = new java.util.Scanner(buyer_file);
        buyerTimes = new java.util.TreeMap<java.lang.Integer, java.util.LinkedList<java.lang.String>>();
        while (buyer_scanner.hasNextLine()) {
            java.lang.String nextLn = buyer_scanner.nextLine();
            java.lang.String[] split = nextLn.split(",");
            createTreeMapBuyer(split);
        } 
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("File is not found");
    }
}