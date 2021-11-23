private java.lang.String editCmd(java.lang.String s) {
    if (s.contains("CMD")) {
        java.lang.String c = s.replaceAll(".*?CMD ", "").replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\"", "");
        return c;
    }else
        return null;
    
}