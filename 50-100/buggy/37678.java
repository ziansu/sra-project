private static suneido.database.query.Table.Idx match(java.util.Set<suneido.database.query.Table.Idx> idxs, java.util.List<java.lang.String> index, java.util.Collection<java.lang.String> needs) {
    suneido.database.query.Table.Idx best = null;
    for (suneido.database.query.Table.Idx idx : idxs)
        if ((suneido.util.Util.startsWith(idx.index, index)) && (idx.index.containsAll(needs)))
            if ((best == null) || ((best.size) > (idx.size)))
                best = idx;
            
        
    
    return best;
}