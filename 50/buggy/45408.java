public void closeMasterPart() throws PMIWizard.NXException, java.rmi.RemoteException {
    print("Closing master part");
    ((PMIWizard.BasePart) (getMasterPart())).close(BasePart.CloseWholeTree.TRUE, BasePart.CloseModified.CLOSE_MODIFIED, null);
}