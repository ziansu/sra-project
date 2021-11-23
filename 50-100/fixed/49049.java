@java.lang.Override
public void run() {
    for (int k = 0; k < (stopwatch.SumDoublePrimitiveTask.ARRAY_SIZE); k++)
        values[k] = k + 1;
    
    double sum = 0.0;
    for (int count = 0, i = 0; count < (counter); count++ , i++) {
        if (i >= (values.length))
            i = 0;
        
        sum = sum + (values[i]);
    }
}