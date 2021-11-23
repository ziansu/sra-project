@java.lang.Override
public void cancelRequest(java.lang.Object tag) {
    if (tag != null) {
        mPicasso.cancelTag(tag);
    }
}