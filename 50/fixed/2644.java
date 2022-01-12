@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    Controller.Compiti.Admin controller;
    controller = new Controller.Compiti.Admin(getBasicframe(), getUtenteloggato());
    controller.ResetMC(Dview);
}