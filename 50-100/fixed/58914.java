public static double readDouble(java.util.Scanner sc, java.lang.String prompt) {
    double result = 0.0;
    do {
        mishmart.ServiceClass.inputEmployeeMessage(prompt);
        if (sc.hasNextDouble()) {
            result = sc.nextDouble();
            return result;
        }else {
            mishmart.ServiceClass.inputErrorMessage();
        }
    } while (true );
}