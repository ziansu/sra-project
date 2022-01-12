static boolean isCyclic(java.util.List<PolygonalNumber> list) {
    java.lang.Long lastPostfix = list.get(0).getPrefix();
    for (PolygonalNumber p : list) {
        if (!(p.getPrefix().equals(lastPostfix)))
            return false;
        
        lastPostfix = p.getPostfix();
    }
    return true;
}