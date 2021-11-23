public boolean isLegal(final org.apache.reef.runtime.local.process.RunnableProcessState toState) {
    switch (this) {
        case INIT :
            switch (toState) {
                case RUNNING :
                case ENDED :
                    return true;
                default :
                    return false;
            }
        case RUNNING :
            switch (toState) {
                case ENDED :
                    return true;
                default :
                    return false;
            }
        case ENDED :
            return false;
        default :
            return false;
    }
}