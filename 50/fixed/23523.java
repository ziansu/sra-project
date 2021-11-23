public void setPoint(org.eclipse.dawnsci.analysis.dataset.roi.PointROI point) {
    super.setPoint(point.spt);
    if ((pts.size()) == 0) {
        pts.add(point);
    }else {
        pts.set(0, point);
    }
}