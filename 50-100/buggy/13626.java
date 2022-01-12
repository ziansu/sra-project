public void onDisable() {
    com.thebubblenetwork.api.framework.BubbleNetwork.getInstance().getManager().remove(this);
    try {
        getNetwork().getPacketHub().sendMessage(getNetwork().getProxy(), new com.thebubblenetwork.api.global.bubblepackets.messaging.messages.handshake.JoinableUpdate(false));
    } catch (java.io.IOException e) {
        getNetwork().logSevere(e.getMessage());
        getNetwork().endSetup("Could not set joinable");
    }
    com.thebubblenetwork.bubblelobby.BubbleLobby.setInstance(null);
    listener = null;
    network = null;
}