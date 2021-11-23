public void write(byte[] data) {
    try {
        if ((outStream) != null) {
            outStream.write(data);
            outStream.flush();
        }
    } catch (java.io.IOException e) {
        com.app.carcontrol.util.Log.e(com.app.carcontrol.util.car.thread.ClassifierThread.TAG, "", e);
        onErrorListener.onClassifierError(e);
    }
}