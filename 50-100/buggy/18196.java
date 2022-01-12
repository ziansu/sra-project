@java.lang.Override
public void updateFuelLevel(double value, java.sql.Timestamp timestamp) {
    if ((fuelLevel) == 0.0) {
        fuelLevel = value;
    }
    java.lang.System.out.println(java.lang.String.valueOf((value - (fuelLevel))));
    if (fuelConsumedInterfaceUpdate) {
        updateFuel(value, fuelConsumedInterfaceValue);
        fuelLevelInterfaceUpdate = false;
        fuelConsumedInterfaceUpdate = false;
    }else {
        fuelLevelInterfaceUpdate = true;
        fuelLevelInterfaceValue = value;
    }
}