public void updateFile() {
    java.lang.String timeStamp;
    timeStamp = getCurTime();
    writeToFile(timeStamp, programs);
    getOS();
    java.lang.System.out.println(getOS());
    getRunTime();
}