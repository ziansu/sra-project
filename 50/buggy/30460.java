@java.lang.Override
public int getSizeInBytes() {
    if ((mAnimationBackend) != null) {
        return mAnimationBackend.getSizeInBytes();
    }
    return 0;
}