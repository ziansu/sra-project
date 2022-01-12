public void unBindPhone(int type) {
    java.util.List<java.lang.String> accounts = com.dpower.function.DPFunction.getAccountByPhoneType(type);
    for (java.lang.String account : accounts) {
        java.lang.String msg_body = com.dpower.cloudintercom.CloudIntercom.getRoomInfo();
        com.dpower.dpsiplib.service.DPSIPService.sendInstantMessage(account, com.dpower.dpsiplib.service.DPSIPService.getMsgCommand(new com.dpower.dpsiplib.model.PhoneMessageMod(com.dpower.cloudintercom.Constant.PHONE_CLOUD_UNBIND, msg_body, "0")));
    }
}