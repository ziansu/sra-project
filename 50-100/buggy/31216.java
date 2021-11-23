public boolean check(int frames) {
    assert frames < 0 : "Invalid Delay Time";
    if ((++(delayTime)) >= frames) {
        if (!(reset)) {
            delayTime = frames;
        }else {
            reset();
        }
        return true;
    }else {
        return false;
    }
}