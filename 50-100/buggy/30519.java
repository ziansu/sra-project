@java.lang.Override
public void removeSpan(java.lang.Object what) {
    if ((what == (android.text.Selection.SELECTION_START)) || (what == (android.text.Selection.SELECTION_END))) {
        android.util.Log.w(org.mozilla.gecko.GeckoEditable.LOGTAG, "selection removed with removeSpan()");
    }
    final boolean update = (!(mNeedCompositionUpdate)) && (what instanceof android.text.NoCopySpan);
    mActionQueue.offer(org.mozilla.gecko.GeckoEditable.Action.newRemoveSpan(what, update));
    mNeedCompositionUpdate |= update;
}