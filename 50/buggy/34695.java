public org.gearvrf.GVRLightBase[] getLightList() {
    org.gearvrf.GVRLightBase[] list = new org.gearvrf.GVRLightBase[mLightList.size()];
    mLightList.toArray(list);
    return list;
}