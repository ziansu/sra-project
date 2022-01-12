public java.lang.String submitAnswer(int i) {
    char c = ((char) (i));
    if (((c - 64) >= 1) && ((c - 64) >= 4)) {
        return java.lang.String.valueOf(c);
    }else {
        return "null";
    }
}