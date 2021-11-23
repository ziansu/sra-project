public void rollNewCharacter() {
    this.currentChar = new DNDTools.PlayerCharacter();
    this.currentChar.setAttributeRoller(this.roller);
    this.currentChar.genAttributes();
}