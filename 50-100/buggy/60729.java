public void updateKey(java.lang.String key, java.lang.Boolean used, int meter, int slave, int register, boolean powerScout) {
    if (!(items.isEmpty())) {
        if (items.containsKey(key)) {
            Creator.Sensor s = items.get(key);
            s.updateKey(key, meter, slave, register, used, powerScout);
            items.replace(key, s);
        }else {
            java.lang.System.out.println((("Key: " + key) + " not found!"));
        }
    }
}