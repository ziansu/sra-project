public void stop() {
    synchronized(this) {
        if ((mDisposable) != null) {
            mRunning = false;
            mDisposable.dispose();
            mDisposable = null;
            mSubscribeControl.removeConsumer(com.eternal.davidconsole.serial.command.Spo2WaveCommand.class);
        }
    }
}