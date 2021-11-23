@java.lang.Override
public java.lang.String serialize() {
    java.util.HashMap<java.lang.String, java.lang.String> data = super.getMap();
    if ((effect) != null)
        data.put("effect", effect.serialize());
    
    return regalowl.simpledatalib.CommonFunctions.implodeMap(data);
}