private void updateFaceCentroid() {
    faceCentroid.setToZero();
    for (int i = 0; i < (edges.size()); i++)
        faceCentroid.add(edges.get(i).getOriginVertex());
    
    faceCentroid.scale((1.0 / (edges.size())));
}