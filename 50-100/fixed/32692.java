public java.lang.String evaluate(java.lang.String code, java.lang.String defaultStr) {
    java.lang.String res;
    if (((code == null) || (code.equals(""))) || (code.toLowerCase().equals("null"))) {
        res = "";
    }else {
        java.util.regex.Matcher m = p.matcher(code);
        if (m.find()) {
            res = util.CodeCity.get(code, "");
        }else {
            res = defaultStr;
        }
    }
    return res;
}