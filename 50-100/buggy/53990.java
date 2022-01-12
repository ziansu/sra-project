@java.lang.Override
public java.util.List<com.netbuilder.entities.Address> findByCustomerID(int customerID) {
    java.util.ArrayList<com.netbuilder.entities.Address> address = dummyData.getEntityList(new com.netbuilder.entities.Address());
    java.util.ArrayList<com.netbuilder.entities.Address> foundaddress = new java.util.ArrayList<com.netbuilder.entities.Address>();
    for (int i = 0; i < (address.size()); i++) {
        if ((address.get(i).getCustomerid()) == customerID) {
            foundaddress.add(address.get(i));
        }
    }
    return foundaddress;
}