@org.testng.annotations.Test(expectedExceptions = java.lang.IllegalArgumentException.class, dataProvider = "nullValues")
public void inputDataForValidateAvatarFormatIsNull(org.springframework.web.multipart.MultipartFile file) throws java.lang.Exception {
    avatarService.validateAvatarFormat(file);
}