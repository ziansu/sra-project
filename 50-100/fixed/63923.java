void addItem(java.lang.String[] items, int lineNumber) {
    java.util.ArrayList<java.util.List<java.lang.String>> lines = getFile();
    for (int i = 0; i < (items.length); i++) {
        lines.get((lineNumber - 1)).add(items[i]);
    }
    writeFile(lines, lineNumber);
}