@java.lang.Override
public void onError(java.lang.Throwable t) {
    com.dkohut.bookchat.service.ChatService.observers.remove(responseObserver);
}