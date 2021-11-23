protected void onTimeout() {
    switch (state) {
        case NEW_HEIGHT :
            enterPropose();
            break;
        case PROPOSE :
            enterValidate();
            break;
        case VALIDATE :
            enterPreCommit();
            break;
        case PRE_COMMIT :
            if ((precommitVotes.isAnyApproved()) != null) {
                enterCommit();
            }else {
                enterPropose();
            }
            break;
        case COMMIT :
            if (!(finalized)) {
                enterFinalize();
            }
            break;
        case FINALIZE :
            enterNewHeight();
            break;
    }
}