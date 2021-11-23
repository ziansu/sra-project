public void scroll(java.lang.String direction) {
    if ((direction.equals("UP")) && ((index) != 0)) {
        (index)--;
    }else
        if ((direction.equals("DOWN")) && ((index) < ((accounts.length) - 1))) {
            (index)++;
        }
    
    accountList.setSelectedIndex(index);
}