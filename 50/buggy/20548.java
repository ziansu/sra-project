private void executeInteractor() {
    com.teamagam.gimelgimel.domain.messages.SendTextMessageInteractor interactor = mInteractorFactory.create(mText);
    interactor.execute();
}