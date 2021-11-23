public void run() {
    while ((Main.count) <= (Main.x)) {
        java.lang.System.out.println(("Thread: " + (Main.i)));
        java.lang.System.out.println(("Count = " + (Main.count)));
        java.lang.System.out.println();
        (Main.count)++;
    } 
}