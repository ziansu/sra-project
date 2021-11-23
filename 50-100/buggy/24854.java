private void updateJobState(org.talend.designer.core.ui.editor.update.Job job) {
    getViewer().refresh(job, true);
    switch (updateCategoriesState(job)) {
        case ALL :
            getViewer().setChecked(job, true);
            getViewer().setGrayed(job, false);
            break;
        case SOME :
            getViewer().setGrayChecked(job, true);
            break;
        case NONE :
            getViewer().setGrayChecked(job, false);
            break;
        default :
    }
}