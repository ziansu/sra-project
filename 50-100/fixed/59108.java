public static void main(java.lang.String[] args) {
    java.lang.String accessKey = "51F2531794288EBA64764B38D2516890";
    se.hms.argos.afutest.infra.modbustcp.LoggedParameterData account = new se.hms.argos.afutest.infra.modbustcp.LoggedParameterData(accessKey);
    java.lang.String systemId = account.getSystemID();
    java.lang.String[][] parameterId = account.getParametersID(systemId);
    account.getInputRegister(systemId, parameterId[0][1], parameterId[1][1], parameterId[2][1]);
}