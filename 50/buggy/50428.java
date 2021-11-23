@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    dima.config.common.services.ConfigDAO dao = dima.config.common.services.ServiceFactory.getService(dima.config.common.services.ConfigDAO.class);
    dao.clearAll();
    dima.config.view.importfile.ImportFileActions.openImportADCAction();
}