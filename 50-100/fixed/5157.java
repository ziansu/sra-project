@java.lang.Override
public boolean equals(java.lang.Object arg0) {
    if ((arg0 == null) || (!(arg0 instanceof hu.marianna.problema.HaromKorso.KorsoAllapot))) {
        return false;
    }
    int[] b = ((hu.marianna.problema.HaromKorso.KorsoAllapot) (arg0)).a;
    for (int i = 0; i < 3; i++) {
        if ((a[i]) != (b[i])) {
            return false;
        }
    }
    return true;
}