private static boolean checkUno(Uno.deal play) {
    boolean uno;
    if ((play.getSize()) == 2)
        uno = true;
    else
        uno = false;
    
    return uno;
}