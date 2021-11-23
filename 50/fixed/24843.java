public java.lang.String getCurrentUserName() {
    if (isGeneratedUserName()) {
        return MasterPasswordHolder.INSTANCE.generate(MPSiteType.GeneratedName, MPSiteVariant.Login, siteName, siteCounter, algorithmVersion);
    }else {
        return userName;
    }
}