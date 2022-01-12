private static void printMenu() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    buf.append("Welcome to Employee Salary System, please choose from the following:");
    buf.append(honkot.java.foundation.training.Chapter10_2.LF);
    buf.append(" 1. Create an employee.");
    buf.append(java.lang.System.getProperty("line.separator"));
    buf.append(" 2. Print all employees (names and salaries).");
    buf.append(honkot.java.foundation.training.Chapter10_2.LF);
    buf.append(" 3. Pay all employees for the month and print amount.");
    buf.append(honkot.java.foundation.training.Chapter10_2.LF);
    buf.append(" 4. Exit.");
    buf.append(honkot.java.foundation.training.Chapter10_2.LF);
    java.lang.System.out.println(buf.toString());
}