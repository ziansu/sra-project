static io.sphere.sdk.orders.Parcel of(final java.lang.String id, final java.time.ZonedDateTime createdAt, @javax.annotation.Nullable
final io.sphere.sdk.orders.ParcelMeasurements measurements, @javax.annotation.Nullable
final io.sphere.sdk.orders.TrackingData trackingData) {
    return new io.sphere.sdk.orders.ParcelImpl(id, createdAt, measurements, trackingData);
}