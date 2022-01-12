@java.lang.Override
public java.util.List<net.sharksystem.sharknet.api.Contact> getContacts() {
    if ((myProfile) == null)
        return null;
    
    java.util.List<net.sharksystem.sharknet.api.Contact> contact_list = net.sharksystem.sharknet.api.DummyDB.getInstance().getContact_list(myProfile);
    contact_list.remove(myProfile.getContact());
    contact_list.removeAll(myProfile.getBlacklist().getList());
    return contact_list;
}