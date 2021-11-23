public void fromJsonObject(java.util.Map<java.lang.String, java.lang.Object> map) {
    this.curtainUp = datatypes.enumerations.ToggleState.getValue(((java.lang.String) (map.get("curtainUp"))), this.curtainUp);
    this.mainLightOn = datatypes.enumerations.ToggleState.getValue(((java.lang.String) (map.get("mainLightOn"))), this.mainLightOn);
}