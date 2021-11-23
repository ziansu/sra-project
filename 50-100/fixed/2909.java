public static void main(java.lang.String[] args) {
    final com.company.Chronometer chronometer = new com.company.Chronometer();
    chronometer.start();
    new com.company.Messenger(1, null, chronometer).start();
    new com.company.Messenger(1, null, chronometer).start();
    new com.company.Messenger(1, "Some message", chronometer).start();
}