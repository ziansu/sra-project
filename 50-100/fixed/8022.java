@java.lang.Override
public void setThreadCount(int numThreads) {
    if ((this.hessian) instanceof org.encog.util.concurrency.MultiThreadable) {
        ((org.encog.util.concurrency.MultiThreadable) (this.hessian)).setThreadCount(numThreads);
    }else
        if ((numThreads != 1) && (numThreads != 0)) {
            throw new org.encog.neural.networks.training.TrainingError((("The Hessian object in use(" + (this.hessian.getClass().toString())) + ") does not support multi-threaded mode."));
        }
    
}