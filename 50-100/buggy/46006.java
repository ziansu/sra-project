java.util.List<PolygonalNumber> findPolygonals(int size) {
    java.util.List<PolygonalNumber> result;
    java.lang.Long head = polygonals.firstKey();
    while (true) {
        java.lang.System.out.println(("findPolygonals: head = " + head));
        result = find(size, size, head, 0);
        if (result != null)
            return result;
        
        head = polygonals.higherKey(head);
    } 
}