public void actionPerformed(java.awt.event.ActionEvent event) {
    boolean isAccountExist = client.register(_regAccount, _regPassword);
    if (!isAccountExist) {
        if ((_regAccount) == null)
            text2.setText("Please choose an account name!");
        else
            text2.setText("account existed!");
        
        input4.setText("");
        input5.setText("");
    }else {
        regFrame.setVisible(false);
        searchFrame.setVisible(true);
    }
}