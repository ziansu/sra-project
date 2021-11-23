public static int readInt(java.util.Scanner sc, java.lang.String prompt) {
    int result = 0;
    do {
        mishmart.ServiceClass.inputEmployeeMessage(prompt);
        if (innerRead.hasNextInt()) {
            result = innerRead.nextInt();
            return result;
        }else {
            mishmart.ServiceClass.inputErrorMessage();
        }
    } while (true );
}