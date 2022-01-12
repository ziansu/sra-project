public void displayBlind(java.lang.String blind) {
    if (blind.equals("D")) {
        messages.add(("blindp" + "BB"));
        messages.add(("blindo" + "SB/D"));
    }else {
        messages.add(("blindp" + "SB/D"));
        messages.add(("blindo" + "BB"));
    }
    send();
    clearMessages();
}