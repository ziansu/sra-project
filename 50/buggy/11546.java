@java.lang.Override
public java.util.List<net.sharksystem.sharknet.api.Contact> getList() {
    java.util.List<net.sharksystem.sharknet.api.Contact> blacklist_list = new java.util.LinkedList<>();
    blacklist_list = net.sharksystem.sharknet.api.DummyDB.getInstance().blacklistGet(owner);
    return blacklist_list;
}