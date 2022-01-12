private static void testMode() throws java.io.IOException, java.lang.InterruptedException, org.sikuli.script.FindFailed {
    com.peace.sikuli.monkey.AndroidScreen region = com.peace.auto.bl.DEVICE_1.getRegion(true);
    com.peace.auto.bl.DENG_LU.checkUser(region, status, status.peaceName());
    new com.peace.auto.bl.task.LianMeng().Done(region, status);
    region.close();
}