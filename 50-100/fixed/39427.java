public java.lang.String[] formatRow(java.lang.String[] arrString) {
    java.util.ArrayList<java.lang.String> sl = new java.util.ArrayList<java.lang.String>();
    if (arrString != null) {
        for (int i = 0; i < (arrString.length); i++) {
            if (isNumeric(arrString[i]))
                sl.add(arrString[i]);
            else
                sl.add((("\"" + (arrString[i])) + "\""));
            
        }
    }
    return sl;
}