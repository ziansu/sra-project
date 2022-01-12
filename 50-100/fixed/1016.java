boolean IsItaBomb(int i, int j) {
    java.lang.String[][] fi = field.getfilledField();
    if ("b".equals(fi[firstNumber][secondNumber])) {
        field.setUserFieldSimple(firstNumber, secondNumber, "b");
        return true;
    }
    field.setUserField(firstNumber, secondNumber);
    return false;
}