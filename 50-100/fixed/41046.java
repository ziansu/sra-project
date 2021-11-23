@java.lang.Override
public void partBroughtToTop(org.eclipse.ui.IWorkbenchPart part) {
    org.talend.core.model.process.IProcess2 process = getJobFromActivatedEditor(part);
    if ((process != null) && ((org.talend.designer.core.ui.ActiveProcessTracker.currentProcess) != process)) {
        org.talend.designer.core.ui.ActiveProcessTracker.changedProcess = true;
        org.talend.designer.core.ui.ActiveProcessTracker.currentProcess = process;
        org.talend.core.ui.context.view.Contexts.setTitle(process.getLabel());
        setContextsView(process, part);
        org.talend.designer.core.ui.views.jobsettings.JobSettings.switchToCurJobSettingsView();
        refreshProcessView();
        for (org.talend.designer.core.ui.IJobTrackerListener listener : org.talend.designer.core.ui.ActiveProcessTracker.jobTrackerListeners) {
            listener.focusOnJob(process);
        }
    }
}