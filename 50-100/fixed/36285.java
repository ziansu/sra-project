public static void randomSleep(int low, int high) {
    java.lang.System.out.println("Begin to sleep");
    java.util.Random r = new java.util.Random();
    int time = (r.nextInt((high - low))) + low;
    try {
        java.lang.Thread.sleep(time);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println("Finish sleeping");
}