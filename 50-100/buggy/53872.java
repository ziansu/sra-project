public double getAverageHumid() {
    if ((!(changed)) && ((avgTemp) == null))
        return avgHumid;
    
    double total = 0;
    for (int i = 0; i < (this.size); i++) {
        total += secs[i].getHumid();
    }
    return total / (size);
}