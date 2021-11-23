@java.lang.Override
@android.support.annotation.CallSuper
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    android.util.Log.v(Juggler.TAG, ("onAttach " + (this)));
    if (!((getActivity()) instanceof me.ilich.juggler.gui.JugglerActivity)) {
        throw new java.lang.RuntimeException("JugglerFragment can be attached only to JugglerActivity");
    }
    activity = ((me.ilich.juggler.gui.JugglerActivity) (getActivity()));
}