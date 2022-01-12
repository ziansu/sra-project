private int getInt(java.lang.String strKeyName) {
    if (this.getString(strKeyName).equals("")) {
        return 0;
    }
    return java.lang.Integer.parseInt(this.get(strKeyName).toString());
}