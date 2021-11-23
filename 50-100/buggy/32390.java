@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    EventDispatcher.instance.dispatchEvent(new org.mhisoft.common.event.MHIEvent(org.mhisoft.common.event.EventType.UserCheckInEvent, "btnAttach", null));
    java.lang.String imageFile = org.mhisoft.wallet.view.ViewHelper.chooseFile(null, "png", "gif", "jpg", "jpeg");
    model.getCurrentItem().addOrReplaceAttachment(imageFile);
    org.mhisoft.wallet.view.WalletForm.LoadImageWorker loadImageWorker = new org.mhisoft.wallet.view.WalletForm.LoadImageWorker(model.getCurrentItem());
    loadImageWorker.execute();
    ServiceRegistry.instance.getWalletModel().setModified(true);
}