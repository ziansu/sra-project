public boolean checkNumber(java.lang.String s) {
    if (s.equals("")) {
        return true;
    }
    try {
        int a = java.lang.Integer.parseInt(s);
        if (a > 0) {
            return true;
        }else {
            java.lang.System.out.println("Number should be above 0:");
            return false;
        }
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.out.println("Please enter an integer:");
        return false;
    }
}