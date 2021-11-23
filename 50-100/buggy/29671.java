public void scroll(java.lang.String direction) {
    if ((direction.equals("UP")) && ((index) != 0)) {
        (index)--;
    }else
        if ((direction.equals("DOWN")) && ((index) < (accounts.length))) {
            (index)++;
        }
    
    accountList.setSelectedIndex(index);
}