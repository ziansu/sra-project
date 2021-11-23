public boolean isSelected() {
    int a = 0;
    for (int c = 0; c < (arl.size()); c++) {
        if (arl.get(c).isSelected()) {
            a++;
        }
    }
    if (a == (arl.size())) {
        return true;
    }else {
        return false;
    }
}