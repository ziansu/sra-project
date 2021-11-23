public static java.lang.String longDT(final byte terrdiff) throws java.lang.IllegalArgumentException {
    switch (terrdiff) {
        case CacheWolf.CacheTerrDiff.CW_DT_10 :
            return "1.0";
        case CacheWolf.CacheTerrDiff.CW_DT_15 :
            return "1.5";
        case CacheWolf.CacheTerrDiff.CW_DT_20 :
            return "2.0";
        case CacheWolf.CacheTerrDiff.CW_DT_25 :
            return "2.5";
        case CacheWolf.CacheTerrDiff.CW_DT_30 :
            return "3.0";
        case CacheWolf.CacheTerrDiff.CW_DT_35 :
            return "3.5";
        case CacheWolf.CacheTerrDiff.CW_DT_40 :
            return "4.0";
        case CacheWolf.CacheTerrDiff.CW_DT_45 :
            return "4.5";
        case CacheWolf.CacheTerrDiff.CW_DT_50 :
            return "5.0";
        case CacheWolf.CacheTerrDiff.CW_DT_UNSET :
            return "-.-";
        default :
            throw new java.lang.IllegalArgumentException(("unmapped terrain or diffulty " + terrdiff));
    }
}