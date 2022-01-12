public icsetlv.trial.model.TraceNode getLastestNode() {
    int len = (size()) - 1;
    if (len > 0) {
        return this.exectionList.get(len);
    }else {
        return null;
    }
}