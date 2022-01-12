private void outputPorperties(java.io.File file) {
    java.io.OutputStream out = null;
    try {
        out = new java.io.FileOutputStream(file);
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