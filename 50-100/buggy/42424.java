@java.lang.Override
public omnikryptec.test.saving.DataMap toDataMap(omnikryptec.test.saving.DataMap data) {
    data.put("isglobal", isglobal);
    data.put("active", active);
    if ((parent) != null) {
        data.put("parent", parent.toDataMap(new omnikryptec.test.saving.DataMap("parent")));
    }
    data.put("position", omnikryptec.util.SerializationUtil.vector3fToString(pos));
    data.put("rotation", omnikryptec.util.SerializationUtil.vector3fToString(rotation));
    return data;
}