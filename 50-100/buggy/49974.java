public static void writeFile(java.lang.String script, java.lang.String name, java.lang.String directory, java.lang.String extention) {
    java.io.BufferedWriter writer = null;
    try {
        writer = new java.io.BufferedWriter(new java.io.FileWriter(((((directory + "\\") + name) + ".") + extention)));
        writer.write(script);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        try {
            writer.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}