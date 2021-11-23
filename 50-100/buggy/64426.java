public void run() {
    func.setInputRunning(true);
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    try {
        java.lang.System.out.print("Indtast ny brutto:");
        func.changeWeight(sc.nextDouble());
        java.lang.System.out.println();
    } catch (java.lang.Exception e) {
    }
    sc.close();
    func.setInputRunning(false);
}