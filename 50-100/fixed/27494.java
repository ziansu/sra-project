public void dumpGraph() {
    if ((this.overTime) || (edu.columbia.psl.cc.util.TimeController.isOverTime())) {
        return ;
    }
    if (!(this.registered)) {
        int[] methodInfo = new int[]{ this.threadId , this.threadMethodId };
        edu.columbia.psl.cc.util.CumuGraphRecorder.registerObjRecord(this.objId, this.methodKey, methodInfo);
    }
}