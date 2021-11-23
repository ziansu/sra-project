public void run() {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    try {
        while (true) {
            java.lang.System.out.println("Indtast ny brutto:");
            func.changeWeight(sc.nextDouble());
            java.lang.System.out.println();
        } 
    } catch (java.lang.Exception e) {
    }
    sc.close();
}