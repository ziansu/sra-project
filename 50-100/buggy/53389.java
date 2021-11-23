public java.lang.String printerFromRide(int riders) {
    if ((maxForce) < 5) {
        if ((maxForce) < 4) {
            if ((willRide(riders)) == ((rideAttraction(riders).doubleValue()) > 0))
                return ("You gained $" + (rideAttraction(riders))) + " from this ride.";
            else
                return "Oh no! There are too many people want to ride this coaster and the operator has a melt down from being overstressed! No profit made.";
            
        }else
            return "Your roller coaster is potentially dangerous. No profit.";
        
    }else
        return "Your roller coaster will literally kill people, please don't have people ride this monstrosity";
    
}