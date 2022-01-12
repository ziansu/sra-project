public static void checkFieldMaximum(final long value, final long maximum, final java.lang.String units, final java.lang.String fieldName, final java.lang.Boolean humanReadableError) {
    if (value > maximum) {
        if (humanReadableError) {
            throw APIException.badRequests.invalidParameterSizeAboveMaximum(fieldName, com.emc.storageos.db.client.util.SizeUtil.humanReadableByteCount(com.emc.storageos.db.client.util.SizeUtil.translateSizeToBytes((value - maximum), units)), com.emc.storageos.db.client.util.SizeUtil.humanReadableByteCount(com.emc.storageos.db.client.util.SizeUtil.translateSizeToBytes(maximum, units)));
        }else {
            com.emc.storageos.api.service.impl.resource.ArgValidator.checkFieldMaximum(value, maximum, units, fieldName);
        }
    }
}