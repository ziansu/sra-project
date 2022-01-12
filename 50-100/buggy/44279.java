public java.lang.String getRobotCoordinate() {
    if ((robotPosition) > 0)
        return ((((20 - ((robotPosition) / 15)) + ", ") + (((robotPosition) % 15) + 1)) + ", ") + ((orientation) * 90);
    else
        return "N/A";
    
}