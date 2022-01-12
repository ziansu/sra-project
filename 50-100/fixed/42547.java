@java.lang.Override
public void sendMessage(sjchat.messages.NewMessageRequest req, io.grpc.stub.StreamObserver<sjchat.messages.MessageResponse> responseObserver) {
    java.util.Random random = new java.util.Random();
    sjchat.messages.Message.Builder messageBuilder = sjchat.messages.Message.newBuilder();
    messageBuilder.setId(null);
    messageBuilder.setMessage(req.getMessage());
    messageBuilder.setUser("user-uuid");
    sjchat.messages.MessageResponse messageResponse = sjchat.messages.MessageResponse.newBuilder().setMessage(messageBuilder).build();
    responseObserver.onNext(messageResponse);
    responseObserver.onCompleted();
}