public boolean hasEnoughSpace(com.twiw.trackman.bean.Talk talk) {
    return (this.volume) >= ((this.usedSpace) + (talk.getValue()));
}