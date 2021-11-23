@java.lang.Override
public android.content.res.Resources getResources() {
    final android.content.res.Resources superResources = super.getResources();
    if (((mVectorResources) == null) || (!(mVectorResources.isBase(superResources)))) {
        mVectorResources = new android.content.res.VectorResources(this, superResources);
    }
    return mVectorResources;
}