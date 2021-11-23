private static long unacker(long m, long n) {
    if (m == 0)
        return n + 1;
    
    if ((m > 0) && (n == 0))
        return javacpp.cmr.com.sdkvsndk.Algorithm.unacker((m - 1), 1);
    
    if (javacpp.cmr.com.sdkvsndk.Algorithm.flag)
        return 0;
    else
        return javacpp.cmr.com.sdkvsndk.Algorithm.unacker((m - 1), javacpp.cmr.com.sdkvsndk.Algorithm.unacker(m, (n - 1)));
    
}