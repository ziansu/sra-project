public void setShopsVisited(java.lang.Integer shopsVisited) {
    boolean show = shopsVisited != null;
    if (show) {
        customersLabel.setText("<html><font size=5>Shops Visited:");
        customers.setText(("<html><font size=5><code>" + shopsVisited));
    }
    customersLabel.setVisible(show);
    this.customers.setVisible(show);
}