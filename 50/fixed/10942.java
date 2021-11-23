@java.lang.Override
public com.adobe.acs.commons.one2one.model.VersionSelection apply(com.adobe.acs.commons.version.Evolution evolution) {
    if (evolution == null) {
        return null;
    }
    return new com.adobe.acs.commons.one2one.model.VersionSelection(evolution.getVersionName(), evolution.getVersionDate());
}