@java.lang.Override
public void onSuccess(com.pm360.milestone.extension.model.entity.MileStoneAdministrator mileStoneAdministrator) {
    this.mileStoneAdministrator = mileStoneAdministrator;
    if ((mileStoneAdministrator != null) && ((mileStoneAdministrator.getManagers()) != null)) {
        actionListener.onSuccess(mileStoneAdministrator.getManagers());
    }
}