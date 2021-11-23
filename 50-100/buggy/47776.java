public static com.jiang.android.push.utils.Target rom() {
    if ((com.jiang.android.push.utils.RomUtil.mTarget) != null)
        return com.jiang.android.push.utils.RomUtil.mTarget;
    
    if (com.jiang.android.push.utils.RomUtil.isEMUI()) {
        com.jiang.android.push.utils.RomUtil.mTarget = Target.EMUI;
        return com.jiang.android.push.utils.RomUtil.mTarget;
    }
    if (com.jiang.android.push.utils.RomUtil.isFlyme()) {
        com.jiang.android.push.utils.RomUtil.mTarget = Target.FLYME;
        return com.jiang.android.push.utils.RomUtil.mTarget;
    }
    if (com.jiang.android.push.utils.RomUtil.isMIUI()) {
        com.jiang.android.push.utils.RomUtil.mTarget = Target.MIUI;
        return com.jiang.android.push.utils.RomUtil.mTarget;
    }
    com.jiang.android.push.utils.RomUtil.mTarget = Target.JPUSH;
    return com.jiang.android.push.utils.RomUtil.mTarget;
}