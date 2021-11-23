private java.lang.Integer conect_helper(java.lang.String line, int start, int end) {
    if ((line.length()) < end)
        return null;
    
    java.lang.String sbond = line.substring(start, end).trim();
    int bond = -1;
    java.lang.Integer b = null;
    if (!(sbond.equals(""))) {
        bond = java.lang.Integer.parseInt(sbond);
        b = new java.lang.Integer(bond);
    }
    return b;
}