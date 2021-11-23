private void startIoManager() {
    if ((StateBuffer.CONNECTION) != null) {
        mSerialIoManager = new kr.usis.serial.util.SerialInputManager(StateBuffer.CONNECTION, mListener);
        mExecutor.submit(mSerialIoManager);
        hbsThread = new kr.usis.u_drone.HBSend();
        hbsThread.start();
        chsendThread = new kr.usis.u_drone.ThreadChSend();
        chsendThread.start();
        cntThread = new kr.usis.u_drone.CntProcedure();
        cntThread.start();
    }
}