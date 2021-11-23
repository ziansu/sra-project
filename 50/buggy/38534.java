private java.util.List<cz.zcu.sar.centraldb.client.persistence.domain.Person> getDataByDate(java.sql.Timestamp startDate, java.sql.Timestamp endDate) {
    java.util.List<cz.zcu.sar.centraldb.client.persistence.domain.Person> o = personRepository.findByDate(startDate, endDate);
    return o == null ? o : new java.util.ArrayList<>();
}