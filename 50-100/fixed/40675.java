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
        this.myStateManipulation.proceed();
        this.loopLoop((willCall ? !true : !false));
    } 
}