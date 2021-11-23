public static void main(java.lang.String[] args) {
    final com.company.Chronometer chronometer = new com.company.Chronometer();
    new java.lang.Thread(new com.company.Messenger(1, null, chronometer), "t1").start();
    new java.lang.Thread(new com.company.Messenger(5, null, chronometer), "t2").start();
    new java.lang.Thread(new com.company.Messenger(7, "Some message", chronometer), "t3").start();
    chronometer.startCount();
}