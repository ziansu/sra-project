private static void deleteEstate() {
    int id = de.dis2011.FormUtil.readInt("ID der Immobilie");
    de.dis2011.data.Estate estate = de.dis2011.data.Estate.load(id);
    if (estate == null) {
        java.lang.System.out.println((("Immobilie mit ID " + id) + " existiert nicht."));
        return ;
    }
    estate.delete(estate.getType());
    java.lang.System.out.println((("Immobilie mit ID " + id) + " wurde gelöscht."));
}