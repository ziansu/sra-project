public void run() {
    while (mm.keepIndexing) {
        java.lang.System.out.println("MEDIA_MANAGER: Indexing movies...");
        indexHelper(new java.io.File(mm.movieDir));
        java.lang.System.out.println("MEDIA_MANAGER: Indexing music...");
        indexHelper(new java.io.File(mm.musicDir));
        mm.isIndexed = true;
        java.lang.System.out.println("MEDIA_MANAGER: Index complete!");
        if (mm.keepIndexing)
            try {
                java.lang.Thread.sleep(delay);
            } catch (java.lang.InterruptedException e) {
            }
        
    } 
}