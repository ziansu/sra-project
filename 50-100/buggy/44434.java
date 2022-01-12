@java.lang.Override
public java.util.List<com.netbuilder.entities.Address> findByPostcode(java.lang.String postcode) {
    java.util.ArrayList<com.netbuilder.entities.Address> addressArray = dummyData.getEntityList(new com.netbuilder.entities.Address());
    java.util.ArrayList<com.netbuilder.entities.Address> foundAddress = new java.util.ArrayList<com.netbuilder.entities.Address>();
    for (int i = 0; i < (addressArray.size()); i++) {
        if ((addressArray.get(i).getPostcode()) == postcode) {
            foundAddress.add(addressArray.get(i));
        }
    }
    return foundAddress;
}