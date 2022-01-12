public static void main(java.lang.String[] arg) {
    for (int q = 0; q < (Main.ACCESS_COUNT); q++) {
        new java.lang.Thread(new MyRunnable(q)).start();
    }
    java.lang.System.out.format("Should be count %d is %d", Main.ACCESS_COUNT, Main.countOfAccess);
}