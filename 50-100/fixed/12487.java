public static com.alexwyler.wwc.dawg.DawgNode getInstance() {
    if ((com.alexwyler.wwc.dawg.DawgNode.instance) == null) {
        try {
            com.alexwyler.wwc.dawg.DawgNode.instance = com.alexwyler.wwc.dawg.DawgNode.makeDawg(new java.io.File("WebContent/words.txt"));
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    return com.alexwyler.wwc.dawg.DawgNode.instance;
}