@java.lang.Override
public java.lang.String apply(java.lang.String input) {
    if ((input.length()) > 16) {
        input = input.substring(16);
    }
    return com.emc.storageos.db.client.model.Initiator.normalizePort(input);
}