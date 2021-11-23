public static boolean isRatedFirstTime(java.lang.String randoId, android.content.Context context) {
    if ((randoId != null) && (context != null)) {
        com.github.randoapp.db.model.Rando randoToUpdate = com.github.randoapp.db.RandoDAO.getRandoByRandoId(context, randoId);
        return (randoToUpdate == null) || ((randoToUpdate.rating) == 0);
    }
    return false;
}