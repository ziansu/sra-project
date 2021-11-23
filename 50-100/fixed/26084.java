@java.lang.Override
public boolean test(com.netflix.imfutility.xsd.conversion.DestContextTypeMap destContextTypeMap) {
    if ((packageType) == null) {
        return true;
    }
    com.netflix.imfutility.itunes.destcontext.wrap.DestContextMapWrapper wrapper = new com.netflix.imfutility.itunes.destcontext.wrap.DestContextMapWrapper(destContextTypeMap);
    com.netflix.imfutility.itunes.ITunesPackageType packageType = com.netflix.imfutility.itunes.ITunesPackageType.fromName(wrapper.getValue(com.netflix.imfutility.itunes.ITunesConversionConstants.DEST_PARAM_VIDEO_SPECIFIED_FOR));
    return (packageType == null) || (java.util.Objects.equals(packageType, this.packageType));
}