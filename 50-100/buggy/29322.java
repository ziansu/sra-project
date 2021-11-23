@java.lang.Override
public com.jdndeveloper.lifereminders.EventTypes.Lifestyle getLifestyle(java.lang.String key) {
    java.lang.String lifestyleGsonString = com.jdndeveloper.lifereminders.storage.Storage.sharedStorageInstance.getSharedPreferenceKey(key);
    if (lifestyleGsonString != null)
        return com.jdndeveloper.lifereminders.storage.Storage.gsonObject.fromJson(lifestyleGsonString, com.jdndeveloper.lifereminders.EventTypes.Lifestyle.class);
    
    java.lang.String failedLifestyleGsonString = com.jdndeveloper.lifereminders.storage.Storage.sharedStorageInstance.getSharedPreferenceKey("Failed_Lifestyle_01");
    return com.jdndeveloper.lifereminders.storage.Storage.gsonObject.fromJson(lifestyleGsonString, com.jdndeveloper.lifereminders.EventTypes.Lifestyle.class);
}