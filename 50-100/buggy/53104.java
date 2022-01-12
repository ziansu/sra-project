@java.lang.Override
public boolean next() throws com.tr.rp.exceptions.RPLException {
    if (movedBack) {
        movedBack = false;
        return !(done);
    }else {
        if (initialized) {
            previousItem = new com.tr.rp.ranks.RankedItem<T>(in.getItem(), in.getRank());
        }else {
            initialized = true;
        }
        done = !(in.next());
        return !(done);
    }
}