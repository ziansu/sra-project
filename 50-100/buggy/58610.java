public java.lang.Boolean isServiceUpdateWarning(android.content.Context context) {
    if (((((this.serviceUpdates) == null) || ((this.lastFindServiceUpdateTimestampMs) < 0)) || (this.inFocus)) || (!(areServiceUpdatesUseful()))) {
        findServiceUpdates(context, false);
        return null;
    }
    return org.mtransit.android.commons.data.ServiceUpdate.isSeverityWarning(this.serviceUpdates);
}