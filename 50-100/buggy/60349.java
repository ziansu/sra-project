public static int getGradeNum(java.lang.String grade) {
    int gradeNum = -1;
    if (grade.equals("K"))
        gradeNum = 0;
    else
        if (grade.equals("H"))
            gradeNum = 9;
        else {
            try {
                gradeNum = java.lang.Integer.parseInt(grade);
            } catch (java.lang.NumberFormatException e) {
                java.lang.System.out.println(("Couldn't find grade for grade string: " + grade));
            }
        }
    
    return gradeNum;
}