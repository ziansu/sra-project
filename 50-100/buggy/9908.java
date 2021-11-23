public static void comChoiceS() {
    java.util.Random rand = new java.util.Random();
    int comPick = (rand.nextInt(3)) + 1;
    if (comPick == 1) {
        java.lang.System.out.println("I chose rock and you chose scissors...I win :p");
        com.bleh.Main.resultsL();
    }else
        if (comPick == 2) {
            java.lang.System.out.println("I chose paper and you chose scissors...I guess you win :(");
            com.bleh.Main.resultsW();
        }else
            if (comPick == 3) {
                java.lang.System.out.println("I chose scissors and you chose scissors...We tied :/");
                com.bleh.Main.resultsT();
            }
        
    
    com.bleh.Main.play();
}