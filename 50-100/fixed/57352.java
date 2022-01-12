public void actionPerformed(java.awt.event.ActionEvent e) {
    word_text.setText(null);
    score_text.setText(null);
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            btnArray[i][j].setEnabled(true);
        }
    }
    list = new java.util.ArrayList<java.lang.String>();
}