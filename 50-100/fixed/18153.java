public boolean isSelected() {
    for (int c = 0; c < (arl.size()); c++) {
        if (!(arl.get(c).isSelected())) {
            return false;
        }
    }
    return true;
}