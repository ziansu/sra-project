public java.lang.String sendPoi() throws java.lang.Exception {
    receiver.POI poi = new receiver.POIImpl(new receiver.PositionImpl(44.55432, 45.83654), "test POI", 0, new receiver.QuizImpl("question", "answer"), new receiver.ClueImpl("clue"));
    java.lang.String message = new receiver.PoiMsgImpl("sender", poi.defaultRepresentation()).defaultRepresentation();
    this.channel.basicPublish(utils.RabbitInfo.EXCHANGE_NAME(), "", null, message.getBytes());
    return message;
}