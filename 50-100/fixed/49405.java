public void setPartOfDay(int periodID) {
    if (((periodID >= 17) && (periodID <= 23)) || ((periodID >= 0) && (periodID <= 5))) {
        this.PartOfDay = "Evening";
    }else
        if ((periodID >= 6) && (periodID <= 12)) {
            this.PartOfDay = "Morning";
        }else
            if ((periodID >= 13) && (periodID <= 18)) {
                this.PartOfDay = "Afternoon";
            }
        
    
}