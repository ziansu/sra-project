private static java.lang.String normalize(java.lang.String s, boolean trim) {
    if (s != null) {
        s = com.skynav.cap2tt.app.Converter.parseText(s, false);
        if (trim)
            s = s.trim();
        
        return s;
    }else
        return null;
    
}