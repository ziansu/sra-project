public boolean logout() throws java.io.IOException {
    if (!(isLoggedIn()))
        return false;
    
    mailer.send(new shared.Message(MessageHeaders.LOGOUT_REQUEST, shared.LCXDelegate.PROTOCOL_VERSION, null, authToken));
    shared.Message reply = mailer.receive();
    switch (reply.getHead()) {
        case LOGOUT_CONFIRMED :
            authToken = "";
            return true;
        default :
            return false;
    }
}