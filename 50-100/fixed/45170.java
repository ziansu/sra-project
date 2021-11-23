public java.lang.String[] getLine(int line) {
    java.util.ArrayList current_line = ((java.util.ArrayList) (_lines.get(line)));
    java.lang.String[] tmp = new java.lang.String[current_line.size()];
    for (int i = 0; i < (tmp.length); i++)
        tmp[i] = ((java.lang.String) (current_line.get(i)));
    
    return tmp;
}