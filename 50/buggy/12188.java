boolean checkShelf(java.lang.String text) {
    java.util.regex.Matcher shelfMatch = shelfPattern.matcher(text);
    if (text.equals(shelfId)) {
        return true;
    }else {
        return false;
    }
}