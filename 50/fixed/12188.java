boolean checkShelf(java.lang.String text) {
    java.util.regex.Matcher shelfMatch = shelfPattern.matcher(text);
    return text.equals(shelfId);
}