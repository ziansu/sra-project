public void handleMenuButtonClick(javafx.event.ActionEvent e) throws java.io.IOException {
    java.lang.String[] seg = e.getSource().toString().split(java.util.regex.Pattern.quote("'"));
    activeCity = seg[((seg.length) - 1)];
    updateValues();
}