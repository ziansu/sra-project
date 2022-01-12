public double stddev() {
    if ((stddev) == 0)
        stddev = edu.princeton.cs.algs4.StdStats.stddev(openSites);
    
    return stddev;
}