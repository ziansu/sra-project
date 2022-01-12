public M getSingleResult() {
    try {
        final javax.persistence.TypedQuery<M> query = getQuery();
        return query.getSingleResult();
    } catch (final javax.persistence.NoResultException e) {
        log.trace("No single result", e);
        return null;
    }
}