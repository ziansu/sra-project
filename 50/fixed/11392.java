private void changeText(java.lang.String string) {
    try {
        label.setText(string);
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}