private void printWarcs(java.util.List<java.lang.String> warcs) {
    if ((warcs.size()) != 0) {
        java.lang.System.out.printf("\n# of warcs: %d\n", warcs.size());
        for (java.lang.String warc : warcs)
            java.lang.System.out.printf("%s\n", warc);
        
    }else
        java.lang.System.out.println("\nNo warcs found!");
    
}