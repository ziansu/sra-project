public static void main(java.lang.String[] args) {
    int age = 30;
    int retirementFund = 10000;
    int yearsInRetirement = 20;
    java.lang.String name = "David Johnson";
    for (int i = age; i <= 65; i++) {
        Errors.recalculate(retirementFund, 0.1);
    }
    int monthlyPension = (retirementFund / yearsInRetirement) / 12;
    java.lang.System.out.println((((name + " will have $") + monthlyPension) + " per month for retirement."));
}