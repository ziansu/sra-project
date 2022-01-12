protected void collectRows(org.nd4j.linalg.api.ndarray.INDArray slice) {
    if (slice.isRowVector()) {
        vectors.add(slice);
    }else
        if (isMatrix()) {
            for (int i = 0; i < (slice.rows()); i++)
                vectors.add(slice.getRow(i));
            
        }else
            for (int i = 0; i < (slice.slices()); i++)
                collectRows(slice.slice(i));
            
        
    
}