public static void addTrioConfirmBtnPressed(int pcID, int wsID, int pcutID, java.util.Date sDate) throws java.io.IOException {
    Entities.TrioCouple newTrio = new Entities.TrioCouple(pcID, wsID, pcutID, sDate);
    PCNMClient.PCNMClientModel.sendMessageToServer(new Entities.Message(Entities.MessageType.ADD_TRIO, newTrio));
}