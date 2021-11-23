@java.lang.Override
public omnikryptec.test.saving.DataMap toDataMap(omnikryptec.test.saving.DataMap data) {
    data.put("camera", ((cam) != null ? cam.toDataMap(new omnikryptec.test.saving.DataMap("camera")) : null));
    return data;
}