private javax.swing.JLabel createLabel(java.beans.PropertyDescriptor desc) {
    java.lang.String text = desc.getDisplayName();
    if (!("".equals(text))) {
        text = propertyFieldLabelMessage.format(new java.lang.Object[]{ desc.getDisplayName() });
    }
    javax.swing.JLabel label = new javax.swing.JLabel(text);
    label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
    text = propertyToolTipMessage.format(new java.lang.Object[]{ desc.getShortDescription() });
    label.setToolTipText(text);
    return label;
}