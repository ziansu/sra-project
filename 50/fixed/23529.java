@com.orhanobut.tracklytics.TrackEvent(value = "event")
@com.orhanobut.tracklytics.TransformAttributeMap(keys = { 0 , 1 }, values = { "value1" , "value2" })
@com.orhanobut.tracklytics.TransformAttribute(value = "key1", defaultValue = "default1")
public java.lang.String foo(@com.orhanobut.tracklytics.TransformAttribute(value = "key2", defaultValue = "default2")
java.lang.Integer val) {
    return null;
}