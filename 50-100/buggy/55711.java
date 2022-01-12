public void writeSubimages(java.util.Vector<Subimage> subimages) {
    for (int i = 0; i < (subimages.size()); i++) {
        subimages.get(i).writeImage((("Subimage" + i) + ".jpg"));
    }
    try (java.io.IOException e = $missing$) {
        java.lang.System.out.println("There was a problem");
    }
}