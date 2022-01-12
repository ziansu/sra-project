public void calculate() throws java.lang.Exception, java.sql.SQLException {
    org.magic.api.beans.MagicCollection mc = new org.magic.api.beans.MagicCollection();
    mc.setName("Library");
    for (org.magic.api.beans.MagicEdition me : list) {
        mapCount.put(me, ((100 * (dao.getCardsFromCollection(mc, me).size())) / (me.getCardCount())));
    }
}