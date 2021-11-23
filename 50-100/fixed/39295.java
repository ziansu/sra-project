public void run() {
    try {
        java.lang.Thread.sleep(500);
        serialPort.close();
        serialPort = null;
        mOutputStream.close();
        hdx.HdxUtil.SetPrinterPower(0);
        callbackContext.success();
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
        callbackContext.error(1);
    } catch (java.lang.InterruptedException ex) {
        ex.printStackTrace();
        callbackContext.error(1);
    }
}