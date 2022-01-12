private void getDataAndCode() {
    messengerSender.sendRepliesTo(response).setMessage(com.phonemap.phonemap.constants.Sockets.RETURN_DATA_AND_CODE).send();
}