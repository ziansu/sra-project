public static java.lang.String getText(long languageId, long textNo) {
    javax.persistence.TypedQuery<org.weitblicker.Text> query = org.weitblicker.PersistenceHelper.emWeitblick.createQuery("SELECT c FROM Text c WHERE c.textNo = :textNo AND c.languageNo = : languageNo", org.weitblicker.Text.class);
    query.setParameter("textNo", textNo);
    query.setParameter("languageId", languageId);
    return query.getSingleResult().getText();
}