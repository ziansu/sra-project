private void insert(int j) {
    if (str.equals(" "))
        str = "";
    
    str = (str) + (java.lang.Integer.toString(j));
    showResult.setText(str);
}