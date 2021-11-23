public boolean isActive() {
    org.joda.time.LocalDate now = org.joda.time.LocalDate.now();
    return (!(now.isBefore(start))) && (now.isBefore(end));
}