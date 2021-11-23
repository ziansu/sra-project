private java.lang.String display(int result, java.lang.StringBuffer strBuf) {
    if (result > (maya.Solution.nbNumbers)) {
        int mod = result % (maya.Solution.nbNumbers);
        display((result / (maya.Solution.nbNumbers)), strBuf);
        strBuf.append(reverse.get(mod));
    }else {
        strBuf.append(reverse.get(result));
    }
    return strBuf.toString();
}