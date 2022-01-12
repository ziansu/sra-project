private void initListeners() {
    subscribedFields = new java.util.ArrayList<>();
    if (((MainActivity.car) == (MainActivity.CAR_ZOE_Q210)) || ((MainActivity.car) == (MainActivity.CAR_ZOE_R240))) {
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_EngineFanSpeed);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_DcPower);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_HvBattTemp);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_ChargingPower);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_HvCoolingState);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_HvEvaporationTemp);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_BatteryConditioningMode);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_ExternalTemperature);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_InternalTemperature);
        addListener(lu.fisch.canze.activities.ClimaTechActivity.SID_TempSetting);
    }
}