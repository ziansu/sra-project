private java.lang.String reasonDescription() {
    switch (reason) {
        case com.polidea.rxandroidble.exceptions.BleScanException.BLUETOOTH_CANNOT_START :
            return "BLUETOOTH_CANNOT_START";
        case com.polidea.rxandroidble.exceptions.BleScanException.BLUETOOTH_DISABLED :
            return "BLUETOOTH_DISABLED";
        case com.polidea.rxandroidble.exceptions.BleScanException.BLUETOOTH_NOT_AVAILABLE :
            return "BLUETOOTH_NOT_AVAILABLE";
        case com.polidea.rxandroidble.exceptions.BleScanException.LOCATION_PERMISSION_MISSING :
            return "LOCATION_PERMISSION_MISSING";
        case com.polidea.rxandroidble.exceptions.BleScanException.LOCATION_SERVICES_DISABLED :
            return "LOCATION_SERVICES_DISABLED";
        default :
            return "UNKNOWN";
    }
}