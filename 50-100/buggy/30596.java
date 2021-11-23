@java.lang.Override
public void refreshLocationInfo() {
    if ((location.getInfo()) == null) {
        moe.akagi.chibaproject.datatype.Decision decision = new moe.akagi.chibaproject.datatype.Decision();
        decision.setEventId(event.getId());
        decision.setSponsorId(MyApplication.user.getId());
        decision.setType(Decision.TYPE_LOCA);
        decision.setContent(location.getInfo());
        decision.setAgreePersonNum(0);
        decision.setRejectPersonNum(0);
        moe.akagi.chibaproject.database.API.insertDecision(decision);
        addDecisionCard(decision);
    }
}