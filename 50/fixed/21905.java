private void setToolTipErrorMessage() {
    java.lang.String toolTipErrorMessage = null;
    if ((txtDecorator) != null) {
        if (txtDecorator.isVisible())
            toolTipErrorMessage = txtDecorator.getDescriptionText();
        
    }
    setToolTipMessage(toolTipErrorMessage);
}