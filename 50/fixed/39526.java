@java.lang.Deprecated
static io.sphere.sdk.orders.Parcel of(final java.lang.String id, final java.time.ZonedDateTime createdAt, @javax.annotation.Nullable
final io.sphere.sdk.orders.ParcelMeasurements measurements, @javax.annotation.Nullable
final io.sphere.sdk.orders.TrackingData trackingData) {
    return io.sphere.sdk.orders.Parcel.of(createdAt, id, null, measurements, trackingData);
}