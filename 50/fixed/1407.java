public boolean isValidOp2(java.lang.String input, java.lang.String category) {
    if (category.equalsIgnoreCase("electronics")) {
        if (isState(input)) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}