private boolean isThreadTime1(java.lang.String strText) {
    java.lang.String strLevel = ((java.lang.String) (strText.substring(31, 33)));
    return strLevel.equals("D ") ? true : strLevel.equals("V ") ? true : strLevel.equals("I ") ? true : strLevel.equals("W ") ? true : strLevel.equals("E ") ? true : strLevel.equals("F ") ? true : false;
}