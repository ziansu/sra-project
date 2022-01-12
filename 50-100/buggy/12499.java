@java.lang.Override
public void onClick(android.view.View view) {
    if (status.equals(rustelefonen.no.drikkevett_android.tabs.planParty.BacPlanPartyFragment.Status.RUNNING)) {
        addConsumedUnits(getUnitId());
        if (!(isFirstUnitAdded())) {
            setFirstUnitAdded();
        }
    }
    if (status.equals(rustelefonen.no.drikkevett_android.tabs.planParty.BacPlanPartyFragment.Status.NOT_RUNNING)) {
        addPlannedUnits(getUnitId());
    }
    if (status.equals(rustelefonen.no.drikkevett_android.tabs.planParty.BacPlanPartyFragment.Status.DA_RUNNING)) {
    }
    stateHandler(status);
}