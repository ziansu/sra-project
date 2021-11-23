public boolean isValidOp2(java.lang.String input, java.lang.String category) {
    if (input.equalsIgnoreCase("electronics")) {
        if (isState(input)) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}