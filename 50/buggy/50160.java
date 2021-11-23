private static int addOrReset(int Fehlversuche, int typ) {
    if (typ == 1) {
        return Fehlversuche++;
    }else
        if (typ == 0) {
            return Fehlversuche = 0;
        }else {
            return 0;
        }
    
}