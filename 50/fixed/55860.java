private java.lang.Double getOccupancyRatio() {
    if ((this.totalSeats) == 0)
        return 0.0;
    
    return ((double) (this.occupiedSeats)) / (this.totalSeats);
}