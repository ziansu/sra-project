public void localize() {
    main.PlaySoccer.isLocalizing = true;
    localization.USLocalizer ultrasonicLocalizer = new localization.USLocalizer(leftMotor, rightMotor, odometer, usSensor, startCorner, navigator);
    ultrasonicLocalizer.doUSLocalization();
    localization.LightLocalizer lightLocalizer = new localization.LightLocalizer(leftMotor, rightMotor, odometer, startCorner, navigator);
    lightLocalizer.doLightLocalization();
    main.PlaySoccer.isLocalizing = false;
}