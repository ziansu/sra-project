@java.lang.Override
public final boolean isValidVersion(final java.lang.String version) {
    return (!((null == version) || (version.isEmpty()))) && (this.database.verifyCommitExists(version));
}