public java.lang.String getValidFileName(com.epsilon.Leak.Hawk.model.FeedEntry entry) {
    java.lang.String fileName = entry.getKey();
    java.lang.String entryTitle = entry.getTitle();
    if ((entryTitle != null) && ((entryTitle.length()) > 0)) {
        java.lang.System.out.println(("Entry Title : " + entryTitle));
        if (com.epsilon.LeakHawk.io.FileManager.isValidName(entryTitle)) {
            fileName = fileName.concat("-").concat(entryTitle);
        }
    }
    return fileName;
}