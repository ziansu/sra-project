@java.lang.Override
public org.esco.portlet.model.FlashInfoList retrieveInfos(java.lang.String escouai) {
    if (((escouai == null) || (escouai.equals(""))) || (escouai.equals("guest"))) {
        return this.userService.retrieveGuestFlashInfo();
    }else {
        return this.userService.retrieveEtabInfos(escouai);
    }
}