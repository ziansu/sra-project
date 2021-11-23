private void jTextField30MouseExited(java.awt.event.MouseEvent evt) {
    try {
        int qty = java.lang.Integer.parseInt(jTextField29.getText());
        int sample = java.lang.Integer.parseInt(jTextField30.getText());
        int days = qty * sample;
        jTextField31.setText(java.lang.Integer.toString(days));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}