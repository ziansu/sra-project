public void localize() {
    main.PlaySoccer.isLocalizing = true;
    localization.LightLocalizer lightLocalizer = new localization.LightLocalizer(leftMotor, rightMotor, odometer, startCorner, navigator);
    lightLocalizer.doLightLocalization();
    localization.USLocalizer ultrasonicLocalizer = new localization.USLocalizer(leftMotor, rightMotor, odometer, usSensor, startCorner, navigator);
    ultrasonicLocalizer.doUSLocalization();
    main.PlaySoccer.isLocalizing = false;
}