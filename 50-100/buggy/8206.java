private void run(java.lang.String fileName) {
    printWelcomeMsg();
    java.lang.System.out.println(tempRH.initialize(fileName));
    Tempo.Tempo.sc = new java.util.Scanner(java.lang.System.in);
    Tempo.Tempo.run = true;
    while (Tempo.Tempo.run) {
        java.util.ArrayList<java.lang.String> output = listenForInput();
        for (java.lang.String line : output) {
            java.lang.System.out.println(line);
            if (output.equals(Tempo.Tempo.EXIT_CMD)) {
                Tempo.Tempo.run = false;
                java.lang.System.out.println(Tempo.Tempo.GOODBYE_MESSAGE);
            }
        }
    } 
}