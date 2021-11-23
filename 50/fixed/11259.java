@java.lang.Override
public boolean isAuthorizedToEditReminder() {
    return (org.sigmah.shared.util.ProfileUtils.isGranted(auth(), GlobalPermissionEnum.EDIT_ALL_REMINDERS)) || (org.sigmah.shared.util.ProfileUtils.isGranted(auth(), GlobalPermissionEnum.EDIT_OWN_REMINDERS));
}