private void setFinishTime() throws Model.UnchangeableException {
    if (changeFlag) {
        this.finishTime = new java.util.Date();
        this.changeFlag = false;
    }else {
        throw new Model.UnchangeableException("Manipulation already finished.");
    }
}