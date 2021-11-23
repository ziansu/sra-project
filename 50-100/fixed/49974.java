public static void writeFile(java.lang.String script, java.lang.String name, java.lang.String directory, java.lang.String extention) {
    try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(((((directory + "\\") + name) + ".") + extention)))) {
        writer.write(script);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}