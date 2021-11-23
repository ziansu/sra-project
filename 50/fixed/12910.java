@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    try {
        this.listener = ((com.urbanairship.richpush.sample.inbox.AbstractInboxFragment.Listener) (context));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.IllegalStateException(("Activities using AbstractInboxFragment must implement " + "the AbstractInboxFragment.Listener interface."));
    }
}