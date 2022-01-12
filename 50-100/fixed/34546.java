public static java.lang.String insertRentalOrder(controller.RentalOrderOptions rentalOrderOpts) {
    database.JDBC jdbc = database.JDBC.getInstance();
    java.lang.String insertRentalOrderQuery = (((((("INSERT INTO RentalOrders (employee_id, customer_id, date_out, total_price) " + "VALUES ('") + (rentalOrderOpts.getEmployeeID())) + "', '") + (rentalOrderOpts.getCustomerID())) + "', now(), '") + (rentalOrderOpts.getTotalPrice())) + "');";
    java.lang.System.out.println(insertRentalOrderQuery);
    return jdbc.update(insertRentalOrderQuery);
}