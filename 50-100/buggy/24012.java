public static void showNotification(java.lang.String text) {
    com.intellij.ui.components.JBLabel topErrorMessage = new com.intellij.ui.components.JBLabel(text);
    topErrorMessage.addMouseListener(new com.inflectra.idea.ui.DisappearListener(com.inflectra.idea.ui.SpiraToolWindowFactory.instance.topInformationPanel, topErrorMessage));
    com.inflectra.idea.ui.SpiraToolWindowFactory.instance.topInformationPanel.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 5)));
    com.inflectra.idea.ui.SpiraToolWindowFactory.instance.topInformationPanel.add(topErrorMessage);
    com.inflectra.idea.ui.SpiraToolWindowFactory.instance.topInformationPanel.updateUI();
    com.inflectra.idea.ui.SpiraToolWindowFactory.instance.bottomPanel.updateUI();
}