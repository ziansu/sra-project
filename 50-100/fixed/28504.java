public int checkNumber(java.lang.String s) {
    if (s.equals("")) {
        return 0;
    }
    while (!(s.equals(""))) {
        try {
            int a = java.lang.Integer.parseInt(s);
            if (a > 0) {
                return a;
            }else {
                java.lang.System.out.println("Number should be above 0:");
                return 0;
            }
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.out.println("Please enter an integer:");
            return 0;
        }
    } 
    return 0;
}