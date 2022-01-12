@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int index = restaurantSelector.getSelectedIndex();
    user.updateRatings(choice.get((index - 1)).getId(), java.lang.Double.parseDouble(ratingSelector.getSelectedItem().toString()));
    try {
        displayRating();
        popup.setVisible(false);
    } catch (javax.swing.text.BadLocationException e1) {
    }
}