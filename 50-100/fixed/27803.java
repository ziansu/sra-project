public static void main(java.lang.String[] args) {
    int age = 30;
    double retirementFund = 10000;
    int yearsInRetirement = 20;
    java.lang.String name = "David Johnson";
    for (int i = age; i <= 65; i++) {
        retirementFund = Errors.recalculate(retirementFund, 0.1);
    }
    double monthlyPension = (retirementFund / yearsInRetirement) / 12;
    java.lang.System.out.println((((name + " will have $") + monthlyPension) + " per month for retirement."));
}