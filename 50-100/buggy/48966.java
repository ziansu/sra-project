public static void listFilesForFolder(java.io.File folder, java.lang.String spaces) {
    DirectoryReader.html += "<ul>";
    for (java.io.File fileEntry : folder.listFiles()) {
        if (fileEntry.isDirectory()) {
            DirectoryReader.html += ("<li>" + (fileEntry.getName())) + "</li>";
            DirectoryReader.listFilesForFolder(fileEntry, spaces);
        }
    }
    DirectoryReader.html += "</ul>";
}