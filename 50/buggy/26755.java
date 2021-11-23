public static void main(java.lang.String[] args) {
    domain.Reservation r = new domain.Reservation("db_027", "db2016");
    r.reserve("CR9", 13);
    r.closeConnection();
}