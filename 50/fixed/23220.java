public static void applyRegistered(@android.support.annotation.NonNull
final android.content.Context context, final boolean isRegistered) {
    io.soramitsu.iroha.IrohaApplication.getSharedPreferences(context).edit().putBoolean(io.soramitsu.iroha.IrohaApplication.SHARED_PREF_REGISTERED_KEY, isRegistered).apply();
}