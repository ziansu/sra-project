public void entryCharacter(char c) {
    if ((pin.length()) > 3) {
        Garage.User currentUser = pinToUser.get(pin.toString());
        if (currentUser == null) {
            terminal.lightLED(0, 3);
        }else {
            currentUser.setInside(true);
            entryLock.open(15);
        }
        pin.setLength(0);
    }else {
        pin.append(c);
    }
}