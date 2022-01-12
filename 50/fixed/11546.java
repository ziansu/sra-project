@java.lang.Override
public java.util.List<net.sharksystem.sharknet.api.Contact> getList() {
    java.util.List<net.sharksystem.sharknet.api.Contact> blacklist_list = net.sharksystem.sharknet.api.DummyDB.getInstance().blacklistGet(owner);
    if (blacklist_list == null) {
        blacklist_list = new java.util.LinkedList<>();
    }
    return blacklist_list;
}