@java.lang.Override
public int getParallelismDegree() {
    return (gpus) == null ? java.lang.Runtime.getRuntime().availableProcessors() : gpus.length;
}