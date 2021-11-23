public static void main(java.lang.String[] args) {
    int difficulty = 3;
    try {
        difficulty = java.lang.Integer.parseInt(args[0]);
        if (difficulty < 0) {
            java.lang.System.out.println("Negative numbers not allowed, defaulting to dificulty = 3");
            difficulty = 3;
        }
    } catch (java.lang.ArrayIndexOutOfBoundsException oobex) {
        java.lang.System.out.println("No argument detected, defaulting to difficulty = 3");
    } catch (java.lang.NumberFormatException nfex) {
        java.lang.System.out.println("Could not parse argument, defaulting to difficulty = 3");
    }
    LaboonCoin lc = new LaboonCoin();
    lc.run(difficulty);
}