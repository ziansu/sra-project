public amazon.db.query.OrderMatch.OrderMatchResult check(javax.xml.datatype.XMLGregorianCalendar createdAfter, javax.xml.datatype.XMLGregorianCalendar createdBefore) {
    return check(java.sql.Time.getTime(createdAfter), java.sql.Time.getTime(createdBefore));
}