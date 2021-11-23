private java.lang.Double getOccupancyRatio() {
    if ((this.totalSeats) == 0)
        return 0.0;
    
    return ((this.occupiedSeats) * 100.0) / (this.totalSeats);
}