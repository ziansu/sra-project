protected static boolean evaluateFuelConsumption() {
    if (((group8.com.application.Application.AlertSystem.shouldAlert) && (group8.com.application.Application.AlertSystem.fuelAlert)) && ((group8.com.application.Application.Controller.getCurrentFuelConsumption()) >= (group8.com.application.Model.ConstantData.extremeFuelConsumption))) {
        group8.com.application.Application.AlertSystem.shouldAlert = false;
        group8.com.application.Application.AlertSystem.fuelAlert = false;
        group8.com.application.Application.AlertSystem.coolDown.start();
        return true;
    }else
        if ((group8.com.application.Application.Controller.getCurrentFuelConsumption()) < (group8.com.application.Model.ConstantData.extremeFuelConsumption)) {
            group8.com.application.Application.AlertSystem.fuelAlert = true;
        }
    
    return false;
}