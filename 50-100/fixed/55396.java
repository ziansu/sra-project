public void setPredictedContactPoints(java.util.List<? extends us.ihmc.euclid.tuple2D.interfaces.Point2DReadOnly> contactPointList) {
    predictedContactPoints.clear();
    if (contactPointList == null) {
        return ;
    }
    for (int i = 0; i < (contactPointList.size()); i++) {
        us.ihmc.euclid.tuple2D.interfaces.Point2DReadOnly point = contactPointList.get(i);
        this.predictedContactPoints.add().set(point);
    }
}