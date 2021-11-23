public static boolean isEnabled(final com.divae.ageto.hybris.install.task.TaskContext taskContext) {
    if ((taskContext.getParameter(com.divae.ageto.hybris.install.task.DecompileTask.DECOMPILER)) == null) {
        return false;
    }
    return ((boolean) (taskContext.getParameter(com.divae.ageto.hybris.install.task.DecompileTask.DECOMPILER)));
}