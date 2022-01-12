public final void setGui(@android.support.annotation.Nullable
org.empyrn.darkknight.GUIInterface guiInterface) {
    if (guiInterface != null) {
        mGuiInterface = new java.lang.ref.WeakReference(guiInterface);
    }else {
        mGuiInterface = null;
    }
}