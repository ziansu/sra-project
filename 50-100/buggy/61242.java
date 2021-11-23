public static com.github.pwittchen.reactivenetwork.library.WifiSignalLevel fromLevel(final int level) {
    switch (level) {
        case 0 :
            return com.github.pwittchen.reactivenetwork.library.WifiSignalLevel.NO_SIGNAL;
        case 1 :
            return com.github.pwittchen.reactivenetwork.library.WifiSignalLevel.VERY_POOR;
        case 2 :
            return com.github.pwittchen.reactivenetwork.library.WifiSignalLevel.POOR;
        case 3 :
            return com.github.pwittchen.reactivenetwork.library.WifiSignalLevel.MEDIUM;
        case 4 :
            return com.github.pwittchen.reactivenetwork.library.WifiSignalLevel.GOOD;
        case 5 :
            return com.github.pwittchen.reactivenetwork.library.WifiSignalLevel.VERY_GOOD;
    }
    return com.github.pwittchen.reactivenetwork.library.WifiSignalLevel.NO_SIGNAL;
}