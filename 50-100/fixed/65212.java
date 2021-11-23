void setContentsFitSize() {
    int parentAvailableWidth;
    if ((flatTextArea.getParent()) == null)
        parentAvailableWidth = -1;
    else {
        java.awt.Insets parentInsets = flatTextArea.getParent().getInsets();
        java.awt.Insets insets = flatTextArea.getInsets();
        parentAvailableWidth = ((((flatTextArea.getParent().getWidth()) - (insets.left)) - (insets.right)) - (parentInsets.left)) - (parentInsets.right);
    }
    setContentsFitSize(parentAvailableWidth, false);
}