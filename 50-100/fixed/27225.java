public void set(final pokepon.pony.Pony.Stat s, int value) {
    switch (s) {
        case ATK :
            atk = value;
            break;
        case DEF :
            def = value;
            break;
        case SPATK :
            spatk = value;
            break;
        case SPDEF :
            spdef = value;
            break;
        case SPEED :
            speed = value;
            break;
        case ACCURACY :
            accuracy = value;
            break;
        case EVASION :
            evasion = value;
            break;
    }
    printDebug((("[Pony] Warning: called set(" + s) + ") ?"));
}