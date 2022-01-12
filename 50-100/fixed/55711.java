public void writeSubimages(java.util.Vector<Subimage> subimages) {
    for (int i = 0; i < (subimages.size()); i++) {
        try {
            subimages.get(i).writeImage((("Subimage" + i) + ".jpg"));
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("There was a problem");
        }
    }
}