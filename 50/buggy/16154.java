public void removeListener(sample.Listener<sample.complex.ComplexBuffer> listener) {
    mComplexBufferBroadcaster.removeListener(listener);
    if (!(mComplexBufferBroadcaster.hasListeners())) {
        mBufferProcessor.stop();
    }
}