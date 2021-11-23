public static synchronized de.blau.android.Logic newLogic(java.util.de.blau.android.Map map) {
    if ((de.blau.android.Application.logic) == null) {
        de.blau.android.Application.logic = new de.blau.android.Logic(map);
    }
    return de.blau.android.Application.logic;
}