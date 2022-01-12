public void move(int from, int to) {
    int lastPos = getPosition();
    super.add(to, super.remove(from));
    mObservable.notifyChanged();
    if (from == lastPos)
        moveToPosition(to);
    else
        if ((from < lastPos) && (to >= lastPos))
            moveToPosition((lastPos - 1));
        else
            if ((from > lastPos) && (to <= lastPos))
                moveToPosition((lastPos + 1));
            
        
    
}