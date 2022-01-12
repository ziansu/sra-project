public static de.beacon.tom.viibenav_radiomapper.model.Orientation getOrientationFromDegree(int degree) {
    if ((degree >= 90) && (degree < 270))
        return Orientation.back;
    else
        if (((degree >= 0) && (degree < 90)) || ((degree >= 270) && (degree <= 360)))
            return Orientation.front;
        else
            return Orientation.undetermined;
        
    
}