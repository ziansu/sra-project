private static java.lang.String normalize(java.lang.String s, boolean trim) {
    if (s != null) {
        java.lang.String t = com.skynav.cap2tt.app.Converter.parseText(s, false);
        if (t != null)
            s = t;
        
        if (trim)
            s = s.trim();
        
        return s;
    }else
        return null;
    
}