public static boolean isSalarySet() {
    if ((de.drk.akrd.UtilityBox.salaryMap) == null) {
        if (de.drk.akrd.UtilityBox.readSalary()) {
            return true;
        }
    }
    return false;
}