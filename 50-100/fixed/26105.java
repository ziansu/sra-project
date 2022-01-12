private java.lang.String validateTemperature(java.lang.String temp) {
    while (true) {
        if (!(database.WorkOut.isNumeric(temp))) {
            java.lang.System.out.println("Wrong format. Has to be a number");
            java.lang.System.out.print("Choose temperatur(number): ");
            temp = scanner.nextLine().trim();
        }else {
            return temp;
        }
    } 
}