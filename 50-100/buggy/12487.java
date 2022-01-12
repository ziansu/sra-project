public static com.alexwyler.wwc.dawg.DawgNode getInstance() {
    if ((com.alexwyler.wwc.dawg.DawgNode.instance) == null) {
        try {
            java.lang.System.out.print("Creating DAWG... ");
            com.alexwyler.wwc.dawg.DawgNode.instance = com.alexwyler.wwc.dawg.DawgNode.makeDawg(new java.io.File("WebContent/words.txt"));
            java.lang.System.out.println("DONE.");
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    return com.alexwyler.wwc.dawg.DawgNode.instance;
}