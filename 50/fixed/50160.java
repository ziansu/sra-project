private static int addOrReset(int Fehlversuche, int typ) {
    if (typ == 1) {
        return Fehlversuche + 1;
    }else
        if (typ == 0) {
            return Fehlversuche = 0;
        }else {
            return 0;
        }
    
}