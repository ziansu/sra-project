public static void deleteBookmark(java.io.File bookmarkFile, java.lang.String alias) {
    java.util.Map<java.lang.String, java.lang.String> aliasesToURLs = Core.Bookmark.getBookmarkFileData(bookmarkFile);
    if (aliasesToURLs.containsKey(alias)) {
        aliasesToURLs.remove(alias);
        Core.Bookmark.updateBookmarkFile(bookmarkFile, aliasesToURLs);
    }else {
        java.lang.System.out.println();
        java.lang.System.out.println(Core.Help.getAliasDoesNotExistMessage());
        java.lang.System.out.println();
    }
}