private java.math.BigInteger getNum(int k, cz.tomkren.fishtron.types.Type t_NF) {
    if (opts.isCachingUsed()) {
        return cache.getNum(k, t_NF);
    }else {
        java.math.BigInteger sum = java.math.BigInteger.ZERO;
        for (cz.tomkren.fishtron.ugen.data.SubsRes subsRes : subs_compute(k, t_NF, 0)) {
            sum = sum.add(subsRes.getNum());
        }
        return sum;
    }
}