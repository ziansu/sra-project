public static java.util.ArrayList<java.io.File> sublist(java.util.ArrayList<java.io.File> files, int start, int end) {
    if (files.isEmpty()) {
        return null;
    }
    java.util.ArrayList<java.io.File> output = new java.util.ArrayList<java.io.File>(((end + 1) - start));
    for (int i = start; i <= end; i++)
        output.add(files.get(i));
    
    return output;
}