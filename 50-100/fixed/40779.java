public void setGenre(java.lang.String s) {
    java.lang.String result;
    result = s.replaceAll("\"", "");
    result = result.substring(1, ((result.length()) - 1));
    genre = result.split(",");
}