public double getAverageTemp() {
    if ((!(changed)) && ((avgTemp) != null))
        return avgTemp;
    
    double total = 0;
    for (int i = 0; i < (this.size); i++) {
        total += secs[i].getTemp();
    }
    return total / (size);
}