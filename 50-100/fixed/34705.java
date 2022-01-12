private void addNewsMaker() {
    java.lang.String newsMakerName = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(selectionView, "Enter in the NewsMaker name:", "NewsMaker Name Entry", javax.swing.JOptionPane.PLAIN_MESSAGE, null, null, null)));
    if (null == newsMakerName) {
        javax.swing.JOptionPane.showMessageDialog(selectionView, "Nothing entered for adding a news maker.", "Invalid Selection", javax.swing.JOptionPane.WARNING_MESSAGE);
        return ;
    }
    if (null == newsMakerName)
        return ;
    
    newsDataBaseModel.addNewsMakerModel(new NewsMakerModel(newsMakerName));
}