private void printWarcs(java.util.List<java.lang.String> warcs) {
    if (!(warcs.isEmpty())) {
        java.lang.System.out.printf("\n# of warcs: %d\n", warcs.size());
        for (java.lang.String warc : warcs)
            java.lang.System.out.printf("%s\n", warc);
        
    }else
        java.lang.System.out.println("\nNo warcs found!");
    
}