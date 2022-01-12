private void startIoManager() {
    if ((StateBuffer.CONNECTION) != null) {
        mSerialIoManager = new kr.usis.serial.util.SerialInputManager(StateBuffer.CONNECTION, mListener);
        mExecutor.submit(mSerialIoManager);
        hbrThread = new kr.usis.u_drone.HBReceive(mHandler);
        hbrThread.setDaemon(true);
        hbrThread.start();
        hbsThread = new kr.usis.u_drone.HBSend();
        hbsThread.start();
        chsendThread = new kr.usis.u_drone.ThreadChSend();
        chsendThread.start();
        cntThread = new kr.usis.u_drone.CntProcedure();
        cntThread.start();
    }
}