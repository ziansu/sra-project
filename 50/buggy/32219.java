public static boolean isRegistered(android.content.Context context) {
    return io.soramitsu.iroha.IrohaApplication.getSharedPreferences(context).getBoolean(io.soramitsu.iroha.IrohaApplication.SHARED_PREF_REGISTERED_KEY, false);
}