public void setValue(java.lang.String key, java.lang.Number value) {
    if ((value == null) || (dataStructure.objects.Measurements.isNA(value)))
        values.remove(key);
    else
        values.put(key, value);
    
    modifications = true;
}