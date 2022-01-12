public de.parkand.verschlag.schlag.MarketingYear findActiveYear() {
    org.hibernate.Session session = createSession();
    try {
        de.parkand.verschlag.schlag.MarketingYear year = findActiveYear(session);
        closeSession(session);
        return year;
    } catch (org.hibernate.HibernateException exception) {
        de.parkand.verschlag.database.hibernate.MarketingYearHibernateConnection.logger.error(exception.getMessage(), exception);
        rollback(session);
        throw new javax.ws.rs.InternalServerErrorException(exception.getMessage());
    }
}