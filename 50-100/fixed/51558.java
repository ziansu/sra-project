@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof org.kohsuke.github.GHLicenseBase))
        return false;
    
    org.kohsuke.github.GHLicenseBase that = ((org.kohsuke.github.GHLicenseBase) (o));
    return getUrl().toString().equals(that.getUrl().toString());
}