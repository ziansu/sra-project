public void addListener(sample.Listener<sample.complex.ComplexBuffer> listener) {
    synchronized(mComplexBufferBroadcaster) {
        mComplexBufferBroadcaster.addListener(listener);
        if (((mBufferProcessor) == null) || (!(mBufferProcessor.isRunning()))) {
            mBufferProcessor = new source.tuner.airspy.AirspyTunerController.BufferProcessor();
            java.lang.Thread thread = new java.lang.Thread(mBufferProcessor);
            thread.setDaemon(true);
            thread.setName("Airspy Buffer Processor");
            thread.start();
        }
    }
}