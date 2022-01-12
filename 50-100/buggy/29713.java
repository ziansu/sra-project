public void fromJsonObject(java.util.Map<java.lang.String, java.lang.Object> map) {
    this.curtainUp = datatypes.enumerations.ToggleState.getValue(((datatypes.enumerations.Switch) (map.get("curtainUp"))), this.curtainUp);
    this.mainLightOn = datatypes.enumerations.ToggleState.getValue(((datatypes.enumerations.Switch) (map.get("mainLightOn"))), this.mainLightOn);
}