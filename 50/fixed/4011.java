public static void verifyPhoneToken(@android.support.annotation.NonNull
java.lang.String token, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    if (token != null) {
        com.airmap.airmapsdk.networking.services.PilotService.verifyToken(token, callback);
    }
}