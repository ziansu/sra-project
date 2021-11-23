public void onItemClick(android.view.View view, int position) {
    de.oerntec.votenote.MainDialogHelper.showChangeLessonDialog(((de.oerntec.votenote.MainActivity) (getActivity())), mSubjectId, ((java.lang.Integer) (view.getTag())));
}