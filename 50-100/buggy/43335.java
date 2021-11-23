private int[] readArrayFromFile(java.lang.String file, int length) throws java.io.IOException {
    java.util.List<java.lang.String> lines = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(file));
    int[] data = new int[length];
    for (int i = 0; i < (data.length); ++i)
        data[i] = new java.lang.Integer(lines.get(i));
    
    return data;
}