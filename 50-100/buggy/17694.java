public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String tempName = playerNameField.getText().replace(" ", "");
    if (((!(tempName.equals(""))) && (!(playerList.contains(tempName)))) && ((playerList.size()) < 8)) {
        playerList.addElement(tempName);
        list.updateUI();
        playerNameField.setText("");
    }
}