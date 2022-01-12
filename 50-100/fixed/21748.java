private java.lang.String trimZeroes(java.lang.String number) {
    int index;
    for (index = 0; index < (number.length()); index++) {
        if ((number.charAt(index)) != (assignment.HugeInteger.ZERO)) {
            break;
        }
    }
    if (index == (number.length())) {
        return java.lang.Character.toString(assignment.HugeInteger.ZERO);
    }else {
        return number.substring(index);
    }
}