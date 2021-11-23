public void setTemperature(java.lang.String newTemperature) {
    if (!(newTemperature.equals(temperature))) {
        temperature = newTemperature;
        commitChanges();
    }
}