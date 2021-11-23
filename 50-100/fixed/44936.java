public net.alexbarry.charmem.CharEntry nextChar() {
    this.charIndex += 1;
    if ((this.charIndex) >= (this.chars.size())) {
        this.charIndex = 0;
        this.laps += 1;
    }
    return this.getCurrentChar();
}