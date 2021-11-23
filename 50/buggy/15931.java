private void abandonQuest(java.lang.String questId) {
    java.lang.System.out.println("Abandon Quest Called");
    DailiesPacketHandler.INSTANCE.sendToServer(new net.torocraft.dailies.messages.AbandonQuestRequest(questId));
}