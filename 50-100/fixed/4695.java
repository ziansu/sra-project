public static void main(java.lang.String[] args) {
    java.util.Scanner mainScan = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Which method would you like to run? Type: numAvg, sup, xor randy. ");
    java.lang.String choice = mainScan.nextLine();
    if (choice.equals("numAvg")) {
        Input5_1.numAvg();
    }else
        if (choice.equals("sup")) {
            Input5_1.sup();
        }else
            if (choice.equals("randy")) {
                Input5_1.randy();
            }else {
                java.lang.System.out.println("You broke the computer.");
            }
        
    
}