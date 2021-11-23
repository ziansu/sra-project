public static com.lody.legend.art.ArtMethod of(java.lang.reflect.Method method) {
    if ((Build.VERSION.SDK_INT) >= 23) {
        return java.lang.Runtime.is64Bit() ? new com.lody.legend.art.ArtMethodStructV23_64Bit(method) : new com.lody.legend.art.ArtMethodStructV23(method);
    }else
        if ((Build.VERSION.SDK_INT) >= 21) {
            return java.lang.Runtime.is64Bit() ? new com.lody.legend.art.ArtMethodStructV22_64Bit(method) : new com.lody.legend.art.ArtMethodStructV22(method);
        }else {
            return new com.lody.legend.art.ArtMethodStructV19(method);
        }
    
}