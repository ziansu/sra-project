public synchronized java.io.Serializable jvnInvalidateWriterForReader() throws jvn.JvnException {
    switch (state) {
        case RWC :
            try {
                this.wait();
            } catch (java.lang.InterruptedException e) {
            }
            break;
        case W :
            try {
                this.wait();
            } catch (java.lang.InterruptedException e) {
            }
            break;
        default :
            break;
    }
    state = JvnObjectState.NL;
    return object;
}