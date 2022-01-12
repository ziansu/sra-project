public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String link = tf.getText();
    boolean inFront = checkBox.isSelected();
    if (!(link.isEmpty())) {
        c.addToList(link, wishlist.isSelected(), inFront, tf, fail, frame);
    }else {
        fail.setText("No valid Link");
        new gui.ShowLabelThread(fail, frame).start();
    }
}