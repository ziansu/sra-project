public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Welcome to the Batting Average Calculator!");
    while (Main.userContinueProgram()) {
        int[][] batArray = Main.userInput();
        for (int i = 0; i < (batArray.length); i++) {
            java.lang.System.out.printf("Batter %5d Batting average: %-10.2f Slugging percentage: %-10.2f", (i + 1), Main.calcBatPerc(batArray), Main.calcSlugPerc(batArray));
            java.lang.System.out.println();
        }
    } 
}