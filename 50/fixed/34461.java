protected void addDevHist(java.lang.String s) {
    java.lang.String message = devHist.getText().toString();
    message = (message + s) + "\n";
    devHist.setText(message);
}