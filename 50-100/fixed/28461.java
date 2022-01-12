@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int actionId, android.view.KeyEvent keyEvent) {
    if ((android.view.inputmethod.EditorInfo.IME_ACTION_DONE) == actionId) {
        activity = ((br.com.collegenotebook.EditNameDialogListener) (getActivity()));
        activity.onFinishEditDialog(materia);
        this.dismiss();
        return true;
    }
    return false;
}