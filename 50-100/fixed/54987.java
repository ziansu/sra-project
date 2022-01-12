@java.lang.Override
public void run() {
    while (mRunning) {
        synchronized(mSignal) {
            switch (mDecoderStatus) {
                case IDLE :
                    stop();
                    break;
                case SEARCHING_SIGNAL :
                case SEARCHING_START_BIT :
                    processIterationSearch();
                    break;
                case DECODING :
                    processIterationDecode();
                    break;
            }
        }
    } 
}