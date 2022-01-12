@java.lang.Override
public com.edu.nju.asi.service.serviceImpl.Case uploadOnline(org.springframework.web.multipart.MultipartFile uploadedFile) throws java.io.IOException {
    if (uploadedFile.isEmpty()) {
        return null;
    }
    java.lang.String thisPath = uploadedFile.getName();
    java.io.File thisFile = new java.io.File(thisPath);
    uploadedFile.transferTo(thisFile);
    com.edu.nju.asi.service.serviceImpl.Case wanted = parseXML(thisPath);
    boolean deleteResult = thisFile.delete();
    java.lang.System.out.println(deleteResult);
    return wanted;
}