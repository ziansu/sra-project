protected boolean onCaughtException(int request_code, android.app.mvp.MvpException error) {
    return android.app.mvp.MvpHandler.caughtException(request_code, error);
}