private void getDataAndCode() {
    messengerSender.setMessage(com.phonemap.phonemap.constants.Sockets.RETURN_DATA_AND_CODE).sendRepliesTo(response).send();
}