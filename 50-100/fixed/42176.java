private java.lang.String display(long result, java.lang.StringBuffer strBuf) {
    if (result > (maya.Solution.nbNumbers)) {
        int mod = ((int) (result % (maya.Solution.nbNumbers)));
        display((result / (maya.Solution.nbNumbers)), strBuf);
        strBuf.append(reverse.get(mod));
    }else {
        strBuf.append(reverse.get(((int) (result))));
    }
    return strBuf.toString();
}