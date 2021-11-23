@java.lang.Override
@android.support.annotation.Nullable
public com.zuluft.autoadapter.renderables.IRenderer getItem(int position) {
    try {
        return mRenderers.get(position);
    } catch (java.lang.IndexOutOfBoundsException ex) {
        return null;
    }
}