@java.lang.Override
public void warn(com.zimbra.cs.account.callback.EphemeralBackendCheck.MigrationStateHelper.Reason reason) {
    switch (reason) {
        case MIGRATION_ERROR :
            ZimbraLog.ephemeral.warn("Previous attribute migration to %s did not succeed; data may not have been migrated to this backend", URL);
            break;
        case NO_MIGRATION :
            ZimbraLog.ephemeral.warn("No record of an attribute migration exists; data may not have been migrated to backend at %s", URL);
            break;
        case URL_MISMATCH :
            ZimbraLog.ephemeral.warn(("Provided URL %s does not match current migration URL %s; data may not have been migrated to this backend.\n" + "Ephemeral data will be forwarded to %s until migration info is reset or the backend is changed to match it"), URL, info.getURL(), info.getURL());
    }
}