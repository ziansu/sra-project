public static void serialize(de.zabuza.webcrawler.struct.EventList list, java.lang.String path) {
    java.io.OutputStream fos = null;
    try {
        fos = new java.io.FileOutputStream(path);
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
        oos.writeObject(list);
    } catch (java.io.IOException e) {
        java.lang.System.err.println("Error while serializing event list.");
        java.lang.System.err.println(e);
    } finally {
        try {
            if (fos != null) {
                fos.close();
            }
        } catch (java.io.IOException e) {
            java.lang.System.err.println("Error while closing serialization stream of event list.");
            java.lang.System.err.println(e);
        }
    }
}