public void setNumberAndSurrogate(java.lang.String str) {
    if (str.substring(((str.length()) - 1), str.length()).equals("*")) {
        surrogate = true;
        number = java.lang.Integer.valueOf(str.substring(0, ((str.length()) - 2)));
    }else {
        surrogate = false;
        number = java.lang.Integer.valueOf(str);
    }
}