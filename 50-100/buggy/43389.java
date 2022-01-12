public void setBufferPercent(int bufferPercent) {
    if (bufferPercent < 0) {
        bufferPercent = 0;
    }
    if (bufferPercent > (com.devbrackets.android.exomedia.event.EMMediaProgressEvent.MAX_BUFFER_PERCENT)) {
        bufferPercent = com.devbrackets.android.exomedia.event.EMMediaProgressEvent.MAX_BUFFER_PERCENT;
    }
    this.bufferPercent = bufferPercent;
    this.bufferPercentFloat = ((float) (bufferPercent)) / ((float) (com.devbrackets.android.exomedia.event.EMMediaProgressEvent.MAX_BUFFER_PERCENT));
}