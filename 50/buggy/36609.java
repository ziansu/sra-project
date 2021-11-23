@java.lang.Override
public void subscribe() {
    mSessionService = new com.example.chatty.service.SessionService(mViewContract.getContext());
    mSessionService.setPresenter(this);
    mSessionService.fetchSessionConnectionData();
}