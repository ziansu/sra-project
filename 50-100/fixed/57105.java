public static com.ontotext.ehri.georecon.place.PlaceIndex deserializeIndex(java.io.File file) throws java.io.IOException {
    java.io.FileInputStream fileInput = new java.io.FileInputStream(file);
    java.io.ObjectInputStream objectInput = new java.io.ObjectInputStream(fileInput);
    com.ontotext.ehri.georecon.place.PlaceIndex placeIndex = null;
    try {
        placeIndex = ((com.ontotext.ehri.georecon.place.PlaceIndex) (objectInput.readObject()));
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        objectInput.close();
        fileInput.close();
        return placeIndex;
    }
}