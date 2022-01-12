@java.lang.Override
public void updateFuelLevel(double value, java.sql.Timestamp timestamp) {
    if ((fuelLevel) == 0.0) {
        fuelLevel = value;
    }
    if (fuelConsumedInterfaceUpdate) {
        updateFuel(value, fuelConsumedInterfaceValue);
        fuelLevelInterfaceUpdate = false;
        fuelConsumedInterfaceUpdate = false;
    }else {
        fuelLevelInterfaceUpdate = true;
        fuelLevelInterfaceValue = value;
    }
}