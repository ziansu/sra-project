static double problem3Rec(double number, int upperLimit, boolean[] isComposite) {
    java.lang.System.out.println(("current number to get prime factor of: " + number));
    for (int i = 0; i < upperLimit; i++) {
        if ((isComposite[i]) == false) {
            if (((number % i) == 0) && ((number / i) != 1))
                return SimpleProblems.problem3Rec((number / i), upperLimit, isComposite);
            
        }
    }
    return number;
}