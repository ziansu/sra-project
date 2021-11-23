public com.marcuslee.fypdemo.obj.Shot findShot(int frame) {
    for (com.marcuslee.fypdemo.obj.Shot shot : com.marcuslee.fypdemo.ObjectHolder.Shots) {
        if (((shot.getStartFrame()) < frame) && ((shot.getEndFrame()) > frame)) {
            return shot;
        }
    }
    return null;
}