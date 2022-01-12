public static com.ontotext.ehri.georecon.place.PlaceIndex deserializeIndex(java.io.File file) throws java.io.IOException {
    java.io.FileInputStream fileInput = new java.io.FileInputStream(file);
    java.io.ObjectInputStream objectInput = new java.io.ObjectInputStream(fileInput);
    try {
        com.ontotext.ehri.georecon.place.PlaceIndex placeIndex = ((com.ontotext.ehri.georecon.place.PlaceIndex) (objectInput.readObject()));
        return placeIndex;
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        objectInput.close();
        fileInput.close();
        return null;
    }
}