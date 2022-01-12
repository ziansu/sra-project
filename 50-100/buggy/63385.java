public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Allocating cycle");
    gc.Cycle survivingCycle = new gc.Cycle("Surviving cycle");
    for (int i = 0; i < 1000; i++) {
        gc.Cycle cycle2 = new gc.Cycle();
    }
    java.lang.System.out.println("Survived cycle allocation without stack overflow!!!!");
    survivingCycle.familyGreeting();
}