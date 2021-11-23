private org.cojen.tupl.CursorFrame lockLastFrame(org.cojen.tupl.CursorFrame lock) {
    for (org.cojen.tupl.CursorFrame f = mLastCursorFrame; f != null; f = f.mPrevCousin) {
        if ((f.tryLock(lock)) != null) {
            return f;
        }
    }
    throw new java.lang.AssertionError();
}