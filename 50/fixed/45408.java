public void closeMasterPart() throws PMIWizard.NXException, java.rmi.RemoteException {
    ((PMIWizard.BasePart) (getMasterPart())).close(BasePart.CloseWholeTree.TRUE, BasePart.CloseModified.CLOSE_MODIFIED, null);
}