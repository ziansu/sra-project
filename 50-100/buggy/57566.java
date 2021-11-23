@java.lang.Override
public void init(@android.support.annotation.NonNull
java.lang.String objectName, @android.support.annotation.NonNull
de.kuschku.libquassel.BusProvider provider, @android.support.annotation.NonNull
de.kuschku.libquassel.client.QClient client) {
    super.init(objectName, provider, client);
    java.lang.String[] split = objectName.split("/");
    de.kuschku.util.AndroidAssert.assertEquals(split.length, 2);
    init(client.networkManager().network(java.lang.Integer.parseInt(split[0])));
}