private void unionAbove(int p) {
    if (p > (n)) {
        if (isOpen((p - (n))))
            uf.union(p, (p - (n)));
        
    }else
        uf.union(p, ((n) * (n)));
    
}