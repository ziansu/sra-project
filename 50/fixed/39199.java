@java.lang.Override
public void post(de.parkand.verschlag.schlag.MarketingYear year) {
    de.parkand.verschlag.database.hibernate.MarketingYearHibernateConnection connection = new de.parkand.verschlag.database.hibernate.MarketingYearHibernateConnection();
    connection.save(year);
}