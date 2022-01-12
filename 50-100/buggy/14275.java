private void outputPorperties(java.io.File filepath) {
    java.io.File properties;
    java.io.OutputStream out = null;
    try {
        properties = createFile(filepath, "config.prop");
        out = new java.io.FileOutputStream(properties);
        prop.store(out, null);
        out.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        if (out != null) {
            try {
                out.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}