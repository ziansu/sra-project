public gov.nasa.gsfc.seadas.contour.data.ContourData getContourData(java.util.ArrayList<gov.nasa.gsfc.seadas.contour.data.ContourData> contours) {
    gov.nasa.gsfc.seadas.contour.data.ContourData mergedContourData = new gov.nasa.gsfc.seadas.contour.data.ContourData(selectedBand, selectedUnfilteredBand.getName(), getFilterShortHandName(), ptsToPixelsMultiplier);
    java.util.ArrayList<gov.nasa.gsfc.seadas.contour.data.ContourInterval> contourIntervals = new java.util.ArrayList<gov.nasa.gsfc.seadas.contour.data.ContourInterval>();
    for (gov.nasa.gsfc.seadas.contour.data.ContourData contourData : contours) {
        if (contourData != null)
            contourIntervals.addAll(contourData.getContourIntervals());
        
    }
    mergedContourData.setContourIntervals(contourIntervals);
    mergedContourData.setFiltered(filterBand);
    return mergedContourData;
}