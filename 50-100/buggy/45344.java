@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    if (isSent)
        return ;
    
    if ((ums) == null)
        ums = new com.swifta.mats.web.utils.UserManagementService();
    
    java.lang.String strResponse = null;
    try {
        strResponse = ums.setParent(tFP.getValue(), tFInitUser.getValue(), tFU.getValue());
        isSent = true;
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
    com.swifta.mats.web.usermanagement.NotifCustom.show("Set Parent", strResponse);
    popup.close();
}