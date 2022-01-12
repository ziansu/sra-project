@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    checkConnection();
    theView.setVisible(false);
    theCAView = new gomoku.CreateAccountView();
    theCAView.setVisible(true);
    caController = new gomoku.CreateAccountController(theCAView, theConnection, theView);
    theConnection.setCreateAccountController(caController);
}