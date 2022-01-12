public void actionPerformed(java.awt.event.ActionEvent e) {
    ((javax.swing.JPanel) (getContentPane().getComponent(2))).removeAll();
    ((javax.swing.JPanel) (getContentPane().getComponent(2))).add(gui.BudgetPlanGUI.scrollpane);
    getContentPane().getComponent(2).revalidate();
}