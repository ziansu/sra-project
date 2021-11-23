private void addChangeStatusButton() {
    changeStatusButton = new javax.swing.JButton("Change Status");
    changeStatusButton.addActionListener(new ChangeStatusListener(changeStatusField, currentProfile));
    add(changeStatusButton, WEST);
}