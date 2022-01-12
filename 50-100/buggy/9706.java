public static de.beacon.tom.viibenav_radiomapper.model.Orientation getOrientationFromSensorHelper() {
    if (((de.beacon.tom.viibenav_radiomapper.model.SensorHelper.getOrientation()) >= 90) && ((de.beacon.tom.viibenav_radiomapper.model.SensorHelper.getOrientation()) < 270))
        return Orientation.back;
    else
        if ((((de.beacon.tom.viibenav_radiomapper.model.SensorHelper.getOrientation()) > 0) && ((de.beacon.tom.viibenav_radiomapper.model.SensorHelper.getOrientation()) < 90)) || (((de.beacon.tom.viibenav_radiomapper.model.SensorHelper.getOrientation()) >= 270) && ((de.beacon.tom.viibenav_radiomapper.model.SensorHelper.getOrientation()) <= 360)))
            return Orientation.front;
        else
            return Orientation.undetermined;
        
    
}