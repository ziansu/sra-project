@org.testng.annotations.Test(expectedExceptions = java.lang.IllegalArgumentException.class)
public void inputDataForProcessConvertAvatarToBase64StringIsNull() throws java.lang.Exception {
    avatarService.convertBytesToBase64String(null);
}