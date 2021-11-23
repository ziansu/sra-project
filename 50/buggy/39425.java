public void OwnPaste(neeapaste.Paste aPaste) {
    this.Pastes.add(aPaste);
    if ((aPaste.getOwner()) != (this)) {
        aPaste.setOwner(this);
    }
}