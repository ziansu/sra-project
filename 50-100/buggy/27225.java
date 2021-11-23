public void set(final pokepon.pony.Pony.Stat s, int value) {
    switch (s) {
        case ATK :
            atk = value;
        case DEF :
            def = value;
        case SPATK :
            spatk = value;
        case SPDEF :
            spdef = value;
        case SPEED :
            speed = value;
        case ACCURACY :
            accuracy = value;
        case EVASION :
            evasion = value;
    }
    printDebug((("[Pony] Warning: called set(" + s) + ") ?"));
}