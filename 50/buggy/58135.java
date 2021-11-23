public static void main(java.lang.String[] args) throws java.lang.InterruptedException, org.sikuli.script.FindFailed {
    org.sikuli.basics.Settings.OcrTextRead = true;
    com.peace.sikuli.monkey.AndroidScreen region = new com.peace.sikuli.monkey.AndroidScreen();
    com.peace.auto.bl.Main.Do(region, com.peace.auto.bl.Main.tasks, 6);
    region.close();
}