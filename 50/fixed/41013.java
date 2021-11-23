public thirdparty.dlib.optimization.LBFGSSearchStrategy.DataHelper copy() {
    thirdparty.dlib.optimization.LBFGSSearchStrategy.DataHelper tmp = new thirdparty.dlib.optimization.LBFGSSearchStrategy.DataHelper();
    tmp.s = java.util.Arrays.copyOf(s, s.length);
    tmp.y = java.util.Arrays.copyOf(y, y.length);
    tmp.rho = rho;
    return tmp;
}