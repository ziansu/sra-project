public static synchronized de.blau.android.Logic newLogic() {
    if ((de.blau.android.Application.logic) == null) {
        de.blau.android.Application.logic = new de.blau.android.Logic();
    }
    return de.blau.android.Application.logic;
}