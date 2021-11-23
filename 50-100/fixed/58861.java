public static java.lang.String[] listSystemPrinters() {
    javax.print.PrintService[] printServices = javax.print.PrintServiceLookup.lookupPrintServices(null, null);
    java.lang.String[] printers = new java.lang.String[printServices.length];
    for (int i = 0; i < (printServices.length); i++) {
        printers[i] = printServices[i].getName().trim();
    }
    return printers;
}