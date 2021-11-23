public void messageFromReceiver(java.lang.String message) {
    com.example.leonid.chatzilla.Chat.ChatFactory.addBackgroundText(getActivity(), message).doTask();
}