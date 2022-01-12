@butterknife.OnTextChanged(value = R.id.productname_text)
@java.lang.SuppressWarnings(value = "unused")
void onProductNameChanged(java.lang.CharSequence text) {
    if ((groups) == null) {
        return ;
    }
    java.lang.String name = de.fau.cs.mad.kwikshop.android.util.StringHelper.removeSpacesAtEndOfWord(text.toString());
    de.fau.cs.mad.kwikshop.android.common.Group group = autoCompletionHelper.getGroup(name);
    if (group != null) {
        group_spinner.setSelection(groups.indexOf(group));
    }
}