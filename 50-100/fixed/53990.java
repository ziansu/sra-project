@java.lang.Override
public com.netbuilder.entities.Address findByCustomerID(int customerID) {
    java.util.ArrayList<com.netbuilder.entities.Address> address = dummyData.getEntityList(new com.netbuilder.entities.Address());
    com.netbuilder.entities.Address foundaddress = new com.netbuilder.entities.Address();
    for (int i = 0; i < (address.size()); i++) {
        if ((address.get(i).getCustomerid()) == customerID) {
            foundaddress = address.get(i);
        }
    }
    return foundaddress;
}