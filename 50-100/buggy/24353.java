@java.lang.Override
public void onClick(android.view.View view) {
    de.appphil.categories.CategoriesApplication application = ((de.appphil.categories.CategoriesApplication) (getApplication()));
    application.getRealTimeGameData().sendMessageToPartner(new de.appphil.categories.messages.InputMessage(adapter.getInput(), application.getRealTimeGameData().getOwnParticipantId()));
    de.appphil.categories.gamelistener.CategoriesRTMRListener listener = application.getRealTimeGameData().getRtmrListener();
    listener.sentInputMessage();
    showWaitingScreen(getResources().getString(R.string.waiting));
}