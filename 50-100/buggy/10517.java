@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        this.listener = ((com.urbanairship.richpush.sample.inbox.AbstractInboxFragment.Listener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.IllegalStateException(("Activities using AbstractInboxFragment must implement " + "the AbstractInboxFragment.Listener interface."));
    }
}