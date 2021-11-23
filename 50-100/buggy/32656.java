@java.lang.Override
protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
    try {
        final java.util.Set<org.eclipse.osee.framework.skynet.core.artifact.Artifact> goals = new java.util.HashSet<org.eclipse.osee.framework.skynet.core.artifact.Artifact>();
        new org.eclipse.osee.ats.artifact.GoalManager().getCollectors(artifacts, goals, true);
        org.eclipse.osee.framework.ui.swt.Displays.ensureInDisplayThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                worldComposite.load(worldEditor.getWorldXWidgetActionPage().getCurrentTitleLabel(), goals);
            }
        });
    } catch (org.eclipse.osee.framework.jdk.core.type.OseeCoreException ex) {
        org.eclipse.osee.framework.logging.OseeLog.log(org.eclipse.osee.ats.internal.Activator.class, OseeLevel.SEVERE_POPUP, ex);
    }
    return org.eclipse.core.runtime.Status.OK_STATUS;
}