@java.lang.Override
public void exec() {
    double dec = 1.0;
    do {
        c.flush(dec);
        dec /= 2;
    } while ((c.getMemoryUsage()) > ((c.getMemoryLimitation()) * (c.threshold)) );
}