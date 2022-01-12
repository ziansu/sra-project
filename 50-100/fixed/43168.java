public void increment(int position) throws paritygames.IllegalTupleException {
    if ((paritygames.dTuple.max) != null) {
        if ((paritygames.dTuple.max.get(position)) < ((tuple[position]) + 1)) {
            setTop(true);
            return ;
        }
    }
    (tuple[position])++;
}