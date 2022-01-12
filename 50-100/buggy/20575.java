public java.lang.String getPhaseString() {
    int phase = getPhase();
    switch (phase) {
        case 1 :
            return "Buy Land Plot";
        case 2 :
            return "Purchase Roboticons";
        case 3 :
            return "Install Roboticons";
        case 4 :
            return "Resource Generation";
        case 5 :
            return "Catch the Chancellor";
        case 6 :
            return "Gambling";
        case 7 :
            return "Resource Auction";
        default :
            return "Unknown phase";
    }
}