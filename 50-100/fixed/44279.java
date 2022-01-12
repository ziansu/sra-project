public java.lang.String getRobotCoordinate() {
    if ((robotPosition) > 0)
        return ((((((robotPosition) % 15) + 1) + ", ") + (20 - ((robotPosition) / 15))) + ", ") + ((orientation) * 90);
    else
        return "N/A";
    
}