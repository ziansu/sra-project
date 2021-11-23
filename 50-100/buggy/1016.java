boolean IsItaBomb(int i, int j) {
    java.lang.String[][] fi = field.getfilledField();
    if (fi[firstNumber][secondNumber].equals("b")) {
        field.setUserFieldSimple(firstNumber, secondNumber, "b");
        return true;
    }
    field.setUserField(firstNumber, secondNumber);
    return false;
}