public static <T> void modifyRecord(T object, net.moddity.droidnubekit.utils.DNKOperationType operationType, DroidNubeKitConstants.kDatabaseType environmentType, final net.moddity.droidnubekit.requests.DNKCallback<java.util.List<T>> callback) {
    if (!(object instanceof net.moddity.droidnubekit.objects.DNKObject)) {
        callback.failure(new java.lang.Exception(("Object it's not instance of DNKRecord: " + (object.toString()))));
        return ;
    }
    java.util.List<T> objects = new java.util.ArrayList<>();
    objects.add(object);
    net.moddity.droidnubekit.DroidNubeKit.modifyRecord(objects, operationType, environmentType, callback);
}