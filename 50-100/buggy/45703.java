public void schedulerIteration(schedulersimulator.Processor processor) {
    schedulersimulator.Task T;
    if (processor.isEmpty()) {
        if ((this.tasksToEnterInProcessor.size()) > 0) {
            T = this.tasksToEnterInProcessor.remove(0);
            processor.setTaskInProcessor(T, T.getExecutionTime());
        }
    }
}