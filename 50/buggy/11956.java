@java.lang.Override
public void cancelRequest(java.lang.String tag) {
    if ((tag != null) && (!(tag.isEmpty()))) {
        mPicasso.cancelTag(tag);
    }
}