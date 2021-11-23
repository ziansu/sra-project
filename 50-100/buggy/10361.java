private java.lang.String editCmd(java.lang.String s) {
    if (s.contains("CMD")) {
        java.lang.System.out.println(("OLD: " + s));
        java.lang.String c = s.replaceAll(".*?CMD ", "").replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\"", "");
        java.lang.System.out.println(("NEW: " + c));
        return c;
    }else
        return null;
    
}