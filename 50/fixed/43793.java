public static void main(java.lang.String[] args) {
    CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-222-2222", 10000, 0.06);
    java.lang.System.out.println("Employee information obtained by get methods:");
    java.lang.System.out.printf("%n%s %s%n,", "First name is", employee.getFirstName());
}