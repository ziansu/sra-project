@java.lang.Override
protected void onExecuteStart(com.kylinolap.job2.execution.ExecutableContext executableContext) {
    this.setStatus(ExecutableStatus.RUNNING);
    com.kylinolap.job2.BaseTestExecutable.jobService.updateJobStatus(this, ExecutableStatus.RUNNING);
}