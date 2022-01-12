public final water.AutoBuffer write_impl(water.AutoBuffer ab) {
    if ((_buf) == null)
        return ab.putInt((-1));
    
    ab.putInt(_len);
    return ab.putA1(_buf, _off, ((_off) + (_len)));
}