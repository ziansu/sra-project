@java.lang.Override
public java.util.List<com.trinet.aboutme.beans.Address> maintaniAddress(com.trinet.aboutme.dtos.AddressDTO addressDTO) {
    java.util.List<com.trinet.aboutme.beans.Address> addressList = getAddressByAddressId(addressDTO.getAddressID());
    com.trinet.aboutme.beans.Address address = new com.trinet.aboutme.beans.Address();
    if (org.apache.commons.collections.CollectionUtils.isNotEmpty(addressList)) {
        address = addressList.get(0);
    }
    populateAddress(addressDTO, address);
    getHibernateTemplate().saveOrUpdate(address);
    return getAddressByAddressId(address.getAddressID());
}