protected void onProgressUpdate(java.lang.String... data) {
    switch (((int) (taskCounter))) {
        case 1 :
            bettaView.setText(data[0]);
            betta = java.lang.Double.parseDouble(data[0]);
            break;
        case 2 :
            alphaView.setText(data[0]);
            alpha = java.lang.Double.parseDouble(data[0]);
            break;
    }
}