private void run(java.lang.String fileName) {
    printWelcomeMsg();
    java.lang.System.out.println(tempRH.initialize(fileName));
    Tempo.Tempo.sc = new java.util.Scanner(java.lang.System.in);
    Tempo.Tempo.run = true;
    while (Tempo.Tempo.run) {
        java.util.ArrayList<java.lang.String> output = listenForInput();
        for (java.lang.String line : output) {
            java.lang.System.out.println(line);
        }
    } 
}