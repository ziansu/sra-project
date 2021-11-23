private boolean handle(final org.bedework.eventreg.requests.EventregRequest request) throws java.lang.Throwable {
    try {
        openDb();
        if (request instanceof org.bedework.eventreg.requests.EventChangeRequest) {
            return handleChange(((org.bedework.eventreg.requests.EventChangeRequest) (request)));
        }
        if (request instanceof org.bedework.eventreg.requests.RegistrationAction) {
            return handleNewReg(((org.bedework.eventreg.requests.RegistrationAction) (request)));
        }
        request.discard();
        return false;
    } finally {
        closeDb();
    }
}