@java.lang.Override
public java.lang.String toString() {
    java.lang.String returnVal = "";
    switch (this) {
        case clusteredMarkers :
            returnVal = "clusteredMarkers";
            break;
        case coloredMarkers :
            returnVal = "coloredMarkers";
            break;
        case zoomLevel :
            returnVal = "zoomLevel";
            break;
        case clusteringTreshhold :
            returnVal = "clusteringTreshhold";
            break;
        case resetFilters :
            returnVal = "resetFilters";
            break;
        case clusteringCoefficient :
            returnVal = "clusteringCoefficient";
            break;
    }
    return returnVal;
}