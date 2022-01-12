public void list(java.lang.String IsoUploadName, java.lang.String useIsoName) {
    java.lang.System.out.println("Execute function ovirt-iso-uploader list");
    java.lang.String isonameinfo = executeCommand("ovirt-iso-uploader list");
    java.lang.System.out.println("End of the execution of the function ovirt-iso-uploader list");
    java.lang.String isoname = useIsoName;
    java.lang.System.out.println("Execute function ovirt-iso-uploader upload");
    java.lang.String ovirtuploadername = (((("ovirt-iso-uploader --iso-domain=" + isoname) + " upload ./uploads/") + IsoUploadName) + ";rm -rf ./uploads/") + IsoUploadName;
    java.lang.System.out.println(ovirtuploadername);
    executeCommandisoupload(ovirtuploadername);
    java.lang.System.out.println((IsoUploadName + " is completed."));
}