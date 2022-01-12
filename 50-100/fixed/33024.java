public static void setPlatform(burlap.domain.singleagent.frostbite.State s, int i, int x, int y, int ss, boolean activatedStatus) {
    burlap.domain.singleagent.frostbite.ObjectInstance platform = s.getObjectsOfTrueClass(burlap.domain.singleagent.frostbite.FrostbiteDomain.PLATFORMCLASS).get(i);
    platform.setValue(burlap.domain.singleagent.frostbite.FrostbiteDomain.XATTNAME, x);
    platform.setValue(burlap.domain.singleagent.frostbite.FrostbiteDomain.YATTNAME, y);
    platform.setValue(burlap.domain.singleagent.frostbite.FrostbiteDomain.SIZEATTNAME, ss);
    platform.setValue(burlap.domain.singleagent.frostbite.FrostbiteDomain.ACTIVATEDATTNAME, activatedStatus);
}