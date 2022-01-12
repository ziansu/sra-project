public void applySkin() {
    if (((mSkinHelpers) != null) || (!(mSkinHelpers.isEmpty()))) {
        skin.support.utils.SkinLog.d(("size - " + (mSkinHelpers.size())));
        for (java.lang.ref.WeakReference ref : mSkinHelpers) {
            if ((ref != null) && ((ref.get()) != null)) {
                ((skin.support.widget.SkinCompatSupportable) (ref.get())).applySkin();
            }
        }
    }
}