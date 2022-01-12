@java.lang.Override
public java.lang.String getNString(int ref) {
    android.util.Log.v(tk.thebrightstuff.blindtale.view.SceneActivity.TAG, (((("Removing accents from " + (getIString(ref))) + " (") + ref) + ")"));
    return tk.thebrightstuff.blindtale.utils.StringUtils.removeAccents(getIString(ref));
}