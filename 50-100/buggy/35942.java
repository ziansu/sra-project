public void allThreadOff() {
    if ((vibroThread) != null) {
        vibroThread.interrupt();
    }
    if ((flashThread) != null) {
        flashThread.interrupt();
    }
    if ((soundThread) != null) {
        soundThread.interrupt();
        test.ivacompany.com.testmetronom.MyService.cam.release();
    }
}