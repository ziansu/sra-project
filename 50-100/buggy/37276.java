public com.pihen.d3restapi.beans.Item getItemDetails(com.pihen.d3restapi.beans.Item i) {
    if (i == null)
        return null;
    
    com.pihen.d3restapi.service.remote.RemoteService<com.pihen.d3restapi.beans.Item> itemService = new com.pihen.d3restapi.service.remote.SpringRemoteService(com.pihen.d3restapi.beans.Item.class);
    conf.setItemId(i.getItemID());
    try {
        return itemService.receiveEntity(conf);
    } catch (com.pihen.d3restapi.service.remote.exception.D3ServerCommunicationException e) {
        org.armory.d3.services.D3ArmoryControler.logger.error(e.getStackTrace());
        javax.swing.JOptionPane.showMessageDialog(null, e, "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        return null;
    }
}