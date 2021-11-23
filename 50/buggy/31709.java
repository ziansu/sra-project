public void removeGroupChat(java.lang.String name) {
    if (groupChatChannels.containsKey(name)) {
        groupChatChannels.remove(name);
        return ;
    }
    vg.civcraft.mc.civchat2.CivChat2.severeMessage("Should not have reached this code  removeGroupChat method");
}