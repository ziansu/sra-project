private int getInt(java.lang.String strKeyName) {
    if (this.get(strKeyName).toString().equals("")) {
        return 0;
    }
    return java.lang.Integer.parseInt(this.get(strKeyName).toString());
}