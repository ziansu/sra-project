@java.lang.Override
public void showCenterDetails(com.mifos.objects.group.CenterWithAssociations centerWithAssociations) {
    setToolbarTitle(centerWithAssociations.getName());
    if (!(centerWithAssociations.getActivationDate().isEmpty())) {
        tvStaffName.setText(centerWithAssociations.getStaffName());
        tvActivationDate.setText(com.mifos.utils.Utils.getStringOfDate(centerWithAssociations.getActivationDate()));
    }
}