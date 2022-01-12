public void actionPerformed(java.awt.event.ActionEvent e) {
    text.getText();
    int text2 = java.lang.Integer.parseInt(text.getText());
    if (text2 < (randomNumber)) {
        result.setText("Too Low");
    }else
        if (text2 > (randomNumber)) {
            result.setText("Too High");
        }else {
            result.setText("You won!");
        }
    
}