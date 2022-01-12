private void serializeBeatListToXML() {
    java.beans.XMLEncoder encoder = null;
    try {
        encoder = new java.beans.XMLEncoder(new java.io.BufferedOutputStream(new java.io.FileOutputStream("beatSettings.xml")));
    } catch (java.io.FileNotFoundException fileNotFound) {
        java.lang.System.out.println("ERROR: While Creating or Opening the File beatSettings.xml");
    }
    encoder.writeObject(this);
    encoder.close();
}