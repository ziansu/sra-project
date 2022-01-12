public java.lang.String[] formatRow(java.lang.String[] arrString) {
    java.util.ArrayList<java.lang.String> sl = new java.util.ArrayList<java.lang.String>();
    if (arrString != null) {
        for (int i = 0; i < (arrString.length); i++) {
            if (isNumeric(s[i]))
                sl.add(s[i]);
            else
                sl.add((("\"" + (s[i])) + "\""));
            
        }
    }
}