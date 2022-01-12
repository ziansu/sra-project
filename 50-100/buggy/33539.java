public java.util.List<java.lang.String> getNetworkNameList() {
    java.util.List<java.lang.String> nwNameList = new java.util.ArrayList<java.lang.String>();
    try {
        java.util.List<com.howardpchen.aries.model.Network> networkList = com.howardpchen.aries.dao.UserDAO.getNetworkList();
        for (com.howardpchen.aries.model.Network network1 : networkList()) {
            nwNameList.add(network1.getDescription());
        }
    } catch (java.lang.Exception e) {
    }
    return nwNameList;
}