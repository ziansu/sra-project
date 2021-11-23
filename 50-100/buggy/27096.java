public void setAllTimeStamp(int compt, java.util.List<java.time.Instant> currentTimeStamp2) {
    if ((this.allTimeStamps.size()) == compt) {
        this.allTimeStamps.add(currentTimeStamp2);
    }else {
        this.allTimeStamps.set(compt, currentTimeStamp2);
    }
}