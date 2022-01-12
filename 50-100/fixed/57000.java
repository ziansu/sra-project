public static boolean isValidBudget(java.lang.String name, java.lang.Object balance) {
    return ((((balance.toString().length()) <= 10) && (com.ft.model.util.Validator.validateString(name))) && ((name.length()) >= 2)) && ((name.length()) <= 20);
}