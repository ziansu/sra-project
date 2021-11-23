public static java.lang.String getIcon() {
    java.lang.String iconBaseName;
    if (ru.sbobrov85.uploadfilesbutton.classes.StateHelper.check()) {
        iconBaseName = ru.sbobrov85.uploadfilesbutton.classes.StateHelper.ICON_16;
    }else {
        iconBaseName = ru.sbobrov85.uploadfilesbutton.classes.StateHelper.ICON_OFF_16;
    }
    return iconBaseName + (ru.sbobrov85.uploadfilesbutton.classes.StateHelper.RESOURCE_FOLDER);
}