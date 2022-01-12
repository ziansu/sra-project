public static boolean isSalarySet() {
    if ((de.drk.akrd.UtilityBox.salaryMap) == null) {
        if (de.drk.akrd.UtilityBox.readSalary()) {
            return true;
        }else {
            return false;
        }
    }else {
        return true;
    }
}