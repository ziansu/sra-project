@javax.annotation.Nonnull
public static java.lang.String getAllOwnerIdsString(@javax.annotation.Nonnull
com.synopsys.arc.jenkins.plugins.ownership.OwnershipDescription descr) {
    java.lang.StringBuilder coowners = new java.lang.StringBuilder();
    for (java.lang.String userId : com.synopsys.arc.jenkins.plugins.ownership.util.OwnershipDescriptionHelper.getSecondaryOwnerIds(descr, true)) {
        if ((coowners.length()) != 0) {
            coowners.append(",");
        }
        coowners.append(userId);
    }
    return coowners.toString();
}