private void recordLightTypes() {
    byte[] lightTypes = new byte[bei.m3c.models.Light.MAX_LIGHTS];
    for (int i = 0; i < (lights.size()); i++) {
        lightTypes[i] = ((byte) (lights.get(i).type));
    }
    bei.m3c.helpers.PICConnectionHelper.sendCommand(new bei.m3c.commands.TRCRecordLightTypesCommand(lightTypes), bei.m3c.fragments.LightsACFragment.LIGHT_TYPES_RECORD_RETRY_INTERVAL_MILLIS, true);
}