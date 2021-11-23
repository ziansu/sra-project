private void loopLoop(boolean willCall) {
    while (true) {
        if (this.myStateManipulation.shouldProceed()) {
            if (willCall) {
                if (this.myStateManipulation.shouldProceed()) {
                    break;
                }else {
                    break;
                }
            }else {
                this.myPayload.runLoopPayload(this.myStateRetrieval);
            }
        }else {
            break;
        }
        this.loopLoop(((this.myStateManipulation.proceed()) || willCall ? !true : !false));
    } 
}