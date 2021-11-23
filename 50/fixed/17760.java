public static android.net.Uri buildCouponUri(long id) {
    return com.example.android.gcncouponalert.app.data.CouponsContract.CouponEntry.CONTENT_URI.buildUpon().appendPath("id").appendPath(java.lang.Long.toString(id)).build();
}