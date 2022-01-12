@java.lang.Override
public void onLoggedIn() {
    this.sendRawCommand("ISTA 000 Authenticated.");
    this.setLastNick(this.getNick());
    this.setLastIP(this.getRealIP());
    this.setValidated();
    this.setState(State.NORMAL);
    this.setLastLogin(this.getLoggedIn());
    this.setLoggedIn(new java.util.Date());
}