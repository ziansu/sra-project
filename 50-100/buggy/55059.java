protected double getThreshold(double value) {
    double oldThreshold;
    if (value >= 0.75) {
        oldThreshold = 0.75;
    }else
        if (value >= 0.5) {
            oldThreshold = 0.5;
        }else
            if (value >= 0.25) {
                oldThreshold = 0.25;
            }else
                if (value >= 0.1) {
                    oldThreshold = 0.1;
                }else
                    oldThreshold = 0.05;
                
            
        
    
    java.lang.System.out.println(("threshold updated to " + oldThreshold));
    return oldThreshold;
}