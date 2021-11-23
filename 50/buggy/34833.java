private java.io.File executablePath() {
    java.io.File geckoBinary = geckoBinaryCalled("geckodriver");
    if (!(geckoBinary.exists())) {
        geckoBinary = geckoBinaryCalled("wires");
    }
    checkForPresenceOfBinary();
    return geckoBinary;
}