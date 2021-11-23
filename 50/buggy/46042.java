private static android.net.Uri insertNut(android.content.ContentResolver contentResolver, com.izettle.wrench.core.Nut nut) {
    return contentResolver.insert(com.izettle.wrench.core.ConfigProviderContract.nutUri(), nut.toContentValues());
}