public void setMax(int max) {
    if ((scrollBar) != null) {
        if (max == 0) {
            scrollBar.setVisible(false);
        }else {
            scrollBar.setVisible(true);
        }
    }
    this.max = max;
}