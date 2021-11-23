@org.testng.annotations.Test(expectedExceptions = java.lang.IllegalArgumentException.class, dataProvider = "nullValues")
public void inputDataForProcessConvertAvatarToBase64StringIsNull(byte[] bytes) throws java.lang.Exception {
    avatarService.convertBytesToBase64String(bytes);
}