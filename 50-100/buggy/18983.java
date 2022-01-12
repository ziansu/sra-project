public static boolean isContainSpace(java.lang.String text) {
    if ((text == null) || ((text.length()) <= 0)) {
        return true;
    }else {
        for (char c : text.toCharArray()) {
            if (!(java.lang.Character.isSpaceChar(c))) {
                return false;
            }
        }
        return true;
    }
}