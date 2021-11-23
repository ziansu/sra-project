private void Events(final java.lang.String login, final int idBudget, final budgets.APIBudgets api) {
    bt_edit.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BT_Edit(evt, login, idBudget, api);
        }
    });
}