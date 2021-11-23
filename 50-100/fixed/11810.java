@java.lang.Override
public boolean canAct(org.roda.wui.client.common.actions.Actionable.Action<org.roda.core.data.v2.ip.IndexedAIP> action, org.roda.core.data.v2.ip.IndexedAIP aip) {
    boolean canAct;
    if (aip.equals(org.roda.wui.client.common.actions.AipActions.NO_AIP_OBJECT)) {
        canAct = org.roda.wui.client.common.actions.AipActions.POSSIBLE_ACTIONS_ON_NO_AIP.contains(action);
    }else
        if (AIPState.UNDER_APPRAISAL.equals(aip.getState())) {
            canAct = (org.roda.wui.client.common.actions.AipActions.POSSIBLE_ACTIONS_ON_SINGLE_AIP.contains(action)) || (org.roda.wui.client.common.actions.AipActions.APPRAISAL_ACTIONS.contains(action));
        }else {
            canAct = org.roda.wui.client.common.actions.AipActions.POSSIBLE_ACTIONS_ON_SINGLE_AIP.contains(action);
        }
    
    return canAct;
}