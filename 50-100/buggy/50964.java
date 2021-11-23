@java.lang.Override
public javabot.Seen getSeen(final java.lang.String nick, final java.lang.String channel) {
    javabot.Seen seen = null;
    try {
        seen = ((javabot.Seen) (getEntityManager().createNamedQuery(LogsDao.SEEN).setParameter("nick", nick).setParameter("channel", channel).setMaxResults(1).getSingleResult()));
    } catch (javax.persistence.NoResultException e) {
    }
    return seen;
}