public static void main(java.lang.String[] args) {
    Mapper.OrderMapper om = new Mapper.OrderMapper();
    try {
        om.putToOrderdetailsTable(15, 36, 2);
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(ex);
    }
}