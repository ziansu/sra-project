javax.swing.JLabel getViewTitleLabel() {
    if ((viewTitleLabel) == null) {
        viewTitleLabel = new javax.swing.JLabel();
        viewTitleLabel.setToolTipText("Click to change the title...");
        viewTitleLabel.setFont(viewTitleLabel.getFont().deriveFont(org.cytoscape.util.swing.LookAndFeelUtil.getSmallFontSize()));
        viewTitleLabel.setMinimumSize(new java.awt.Dimension(viewTitleLabel.getPreferredSize().width, getViewTitleTextField().getPreferredSize().height));
    }
    return viewTitleLabel;
}