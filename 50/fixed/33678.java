public boolean isInputAllowed() {
    return (isActive) || (!(getCurrentCharacter().isNPC()));
}