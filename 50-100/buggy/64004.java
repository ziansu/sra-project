public java.lang.String toString() {
    java.lang.String s = "Table Content: \n";
    for (int i = 0; i < (table.length); i++) {
        if ((table[i]) == null) {
            s = (s + "") + "\n";
        }else
            s = (s + (table[i].getValue().toString())) + "\n";
        
    }
    return s;
}