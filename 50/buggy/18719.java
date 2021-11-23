public static void init(java.lang.Long fromMobile, java.lang.String password) throws frame.sdk.fetion.FetionException {
    frame.sdk.fetion.kit.FetionKit.fromMobile = fromMobile;
    frame.sdk.fetion.kit.FetionKit.password = password;
    frame.sdk.fetion.kit.FetionKit.exec();
}