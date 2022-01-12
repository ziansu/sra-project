private boolean isEnabled(java.lang.String pkgName) {
    java.lang.String mode = tw.fatminmin.xposed.minminguard.Main.pref.getString(Common.KEY_MODE, Common.VALUE_MODE_BLACKLIST);
    if (mode.equals(Common.VALUE_MODE_AUTO)) {
        return true;
    }else
        if (mode.equals(Common.VALUE_MODE_BLACKLIST)) {
            return tw.fatminmin.xposed.minminguard.Main.pref.getBoolean(pkgName, false);
        }else {
            if (pkgName.equals("com.google.android.gms"))
                return true;
            
            return !(tw.fatminmin.xposed.minminguard.Main.pref.getBoolean(tw.fatminmin.xposed.minminguard.Common.getWhiteListKey(pkgName), false));
        }
    
}