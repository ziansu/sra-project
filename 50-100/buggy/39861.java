public int compare(com.roseberry.fictionlibrary.SavedFic first, com.roseberry.fictionlibrary.SavedFic second) {
    if (first.getLibraryTag().equals("")) {
        return java.lang.Integer.MAX_VALUE;
    }else
        if (second.getLibraryTag().equals("")) {
            return java.lang.Integer.MIN_VALUE;
        }else {
            return first.getLibraryTag().compareToIgnoreCase(second.getLibraryTag());
        }
    
}