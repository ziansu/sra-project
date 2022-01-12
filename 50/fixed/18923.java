@java.lang.Override
public void onSuccess(com.blstream.studybox.model.database.Decks response) {
    listener.OnDecksReceived(response);
}