public void move(int from, int to) {
    int lastPos = getPosition();
    super.add(to, super.remove(from));
    mObservable.notifyChanged();
    if (lastPos == from)
        moveToPosition(to);
    
}