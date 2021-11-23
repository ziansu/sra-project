public void setSuperSelected(int superSelected) {
    this.currentSelected = java.lang.Math.max(java.lang.Math.min(superSelected, 0), ((this.menuItems.size()) - 1));
}