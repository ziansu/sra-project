private double getProfitRate(double rfactor) {
    if (rfactor < 1.2) {
        return 0.7;
    }else
        if (rfactor > 2.5) {
            return 0.25;
        }else
            if ((rfactor >= 1.2) && (rfactor <= 2.5)) {
                return 0.25 + (((2.5 - rfactor) / (2.5 - 1.2)) * 0.45);
            }
        
    
    return 0;
}