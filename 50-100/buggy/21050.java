public java.lang.String trimZeroes(java.lang.String number) {
    int index;
    for (index = number.length(); index >= 0; index++) {
        if ((number.charAt(index)) != (assignment.HugeInteger.ZERO)) {
            break;
        }
    }
    if (index == 0) {
        return java.lang.Character.toString(assignment.HugeInteger.ZERO);
    }else {
        return number.substring(index);
    }
}