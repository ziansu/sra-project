public void toggleServerMenuText() {
    if (serverItem.getText().equals("Start a Server")) {
        connectItem.setText("Stop the Server");
    }else {
        connectItem.setText("Start a Server");
    }
}