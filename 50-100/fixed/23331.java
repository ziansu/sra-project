private boolean compatible(long dim, zorbage.type.data.Float64VectorMember v) {
    zorbage.type.data.Float64Member tmp = new zorbage.type.data.Float64Member();
    for (long i = dim; i < (v.length()); i++) {
        v.v(i, tmp);
        if (zorbage.type.data.Float64Vector.g.isNotEqual(tmp, zorbage.type.data.Float64Vector.ZERO))
            return false;
        
    }
    return true;
}