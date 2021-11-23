public java.lang.String printerFromRide(int riders) {
    if ((maxForce) > 5) {
        return "Your roller coaster will literally kill people, please don't have people ride this monstrosity";
    }else
        if ((maxForce) > 4) {
            return "Your roller coaster is potentially dangerous. No profit.";
        }else
            if ((!(willRide(riders))) && ((rideAttraction(riders).doubleValue()) == 0))
                return "Oh no! There are too many people want to ride this coaster and the operator has a melt down from being overstressed! No profit made.";
            else
                return ("You gained $" + (rideAttraction(riders))) + " from this ride.";
            
        
    
}