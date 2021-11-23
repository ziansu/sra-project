@java.lang.Override
public void onSuccess(com.pm360.milestone.extension.model.entity.MileStoneAdministrator mileStoneAdministrator) {
    this.mileStoneAdministrator = mileStoneAdministrator;
    if (mileStoneAdministrator != null) {
        actionListener.onSuccess(mileStoneAdministrator.getManagers());
    }else {
        actionListener.onSuccess(null);
    }
}