public java.lang.String[] getID() {
    java.lang.String[] temp = new java.lang.String[_id.size()];
    for (int i = 0; i < (temp.length); i++) {
        temp[i] = _id.get(i).trim();
    }
    return temp;
}