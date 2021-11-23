@java.lang.Override
public T reduce(scala.Function2<T, T, T> f) {
    com.datatorrent.example.ApexRDD.ReduceOperator reduceOperator = dag.addOperator(("Reduce " + (java.lang.System.currentTimeMillis())), com.datatorrent.example.ApexRDD.ReduceOperator.class);
    reduceOperator.f2 = f;
    return ((T) (this));
}