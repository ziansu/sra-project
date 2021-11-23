public int reference(Frame incomingFrame) {
    (memAccessCount)++;
    int victimFrameNum = -1;
    if (!(incomingFrame.isValid())) {
        (pageFaultCount)++;
        int freeFrameNum = physMem.getFreeFrame();
        if (freeFrameNum > (-1)) {
            victimFrameNum = freeFrameNum;
        }else {
            victimFrameNum = this.chooseVictim().getNumber();
        }
        replacementHandler(victimFrameNum, incomingFrame);
    }
    return victimFrameNum;
}