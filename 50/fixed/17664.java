public boolean selectCharacter(final java.lang.String charName) {
    for (illarion.client.Login.CharEntry chars : charList) {
        if (chars.getName().equals(charName)) {
            selectedChar = chars;
            return true;
        }
    }
    return false;
}