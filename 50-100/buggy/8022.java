@java.lang.Override
public void setThreadCount(int numThreads) {
    if ((this.hessian) instanceof org.encog.util.concurrency.MultiThreadable) {
        ((org.encog.util.concurrency.MultiThreadable) (this.hessian)).setThreadCount(numThreads);
    }else {
        throw new org.encog.neural.networks.training.TrainingError((("The Hessian object in use(" + (this.hessian.getClass().toString())) + ") does not support multi-threaded mode."));
    }
}