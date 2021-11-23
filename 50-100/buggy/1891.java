public void log(java.lang.String AUT, int cnt, double sumCost, double sumDelay, double sumRunTime) {
    java.lang.String log = (((((((AUT + ",") + cnt) + ",") + sumCost) + ",") + sumDelay) + ",") + (sumRunTime / 1000);
    writer.println(log);
    writer.flush();
}