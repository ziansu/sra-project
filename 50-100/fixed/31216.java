public boolean check(int frames) {
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