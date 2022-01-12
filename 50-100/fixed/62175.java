@java.lang.Override
public void onClick(android.view.View view) {
    if (canCompile()) {
        wycliffeassociates.recordingapp.ProjectManager.CompileDialog dialog = wycliffeassociates.recordingapp.ProjectManager.CompileDialog.newInstance(mProject, ((mChapter) - 1), isCompiled());
        dialog.show(mCtx.getFragmentManager(), "single_compile_chapter");
        adapter.notifyItemChanged(vh.getAdapterPosition());
    }
}