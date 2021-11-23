public void removeListener(sample.Listener<sample.complex.ComplexBuffer> listener) {
    synchronized(mComplexBufferBroadcaster) {
        mComplexBufferBroadcaster.removeListener(listener);
        if (!(mComplexBufferBroadcaster.hasListeners())) {
            mBufferProcessor.stop();
        }
    }
}