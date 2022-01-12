@java.lang.Override
public java.util.Collection<codeu.chat.common.User> getUsersExcluding(java.util.Collection<codeu.chat.util.Uuid> ids) {
    java.lang.System.out.println("HERE 6");
    users = new java.util.ArrayList<>();
    try {
        Serializers.INTEGER.write(source.out(), NetworkCode.GET_USERS_EXCLUDING_REQUEST);
        codeu.chat.util.Serializers.collection(Uuid.SERIALIZER).write(source.out(), ids);
        java.lang.System.out.println("WAITING TO GET USER EXCLUDING");
        latch.await();
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("ERROR: Exception during call on server. Check log for details.");
        codeu.chat.client.View.LOG.error(ex, "Exception during call on server.");
    }
    return users;
}