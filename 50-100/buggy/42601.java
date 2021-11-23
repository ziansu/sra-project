public static java.lang.String[] getIds(java.util.Collection<uk.co.ribot.androidboilerplate.data.model.Ribot> ribots) {
    java.lang.String[] ids = new java.lang.String[ribots.size()];
    int i = 0;
    for (uk.co.ribot.androidboilerplate.data.model.Ribot ribot : ribots) {
        ids[i] = ribot.id;
    }
    return ids;
}