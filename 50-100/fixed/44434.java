@java.lang.Override
public com.netbuilder.entities.Address findByPostcode(java.lang.String postcode) {
    java.util.ArrayList<com.netbuilder.entities.Address> addressArray = dummyData.getEntityList(new com.netbuilder.entities.Address());
    com.netbuilder.entities.Address foundAddress = new com.netbuilder.entities.Address();
    for (int i = 0; i < (addressArray.size()); i++) {
        if ((addressArray.get(i).getPostcode()) == postcode) {
            foundAddress = addressArray.get(i);
        }
    }
    return foundAddress;
}