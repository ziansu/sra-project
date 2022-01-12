public void setSetting(fi.foyt.fni.persistence.model.illusion.IllusionEvent event, fi.foyt.fni.persistence.model.illusion.IllusionEventSettingKey key, java.lang.String value) {
    fi.foyt.fni.persistence.model.illusion.IllusionEventSetting eventSetting = illusionEventSettingDAO.findByEventAndKey(event, key);
    if (eventSetting != null) {
        illusionEventSettingDAO.updateValue(eventSetting, value);
    }else {
        illusionEventSettingDAO.create(event, key, value);
    }
}