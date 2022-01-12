public static java.lang.String readString(java.util.Scanner sc, java.lang.String prompt) {
    java.lang.String result = null;
    do {
        mishmart.ServiceClass.inputEmployeeMessage(prompt);
        result = sc.nextLine().trim();
        if (mishmart.ServiceClass.checkString(result)) {
            return result;
        }else {
            mishmart.ServiceClass.inputErrorMessage();
        }
    } while (true );
}