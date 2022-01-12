@java.lang.Override
protected void onSelectionChanged(int start, int end) {
    org.solovyev.android.Check.isMainThread();
    if (!(reportChanges)) {
        return ;
    }
    super.onSelectionChanged(start, end);
    if (start != end) {
        return ;
    }
    if ((editor) == null) {
        org.solovyev.android.Check.shouldNotHappen();
        return ;
    }
    editor.setSelection(start);
}