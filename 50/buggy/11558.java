@java.lang.Override
public void onClick(android.view.View v) {
    if (superClassManager.saveSubject(subjectDialog, rootView, false, false, false)) {
        superClassManager.startNewDetailPage();
    }
}