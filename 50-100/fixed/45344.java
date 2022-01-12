@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    if (isSent)
        return ;
    
    java.lang.String strResponse = null;
    try {
        strResponse = com.swifta.mats.web.utils.UserManagementService.setParent(tFP.getValue(), tFInitUser.getValue(), tFU.getValue());
        isSent = true;
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
    com.swifta.mats.web.usermanagement.NotifCustom.show("Set Parent", strResponse);
    popup.close();
}