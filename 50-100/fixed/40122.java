@java.lang.Override
public at.tuwien.telemedizin.dermadoc.app.general_entities.casedata.CaseData addCaseData(at.tuwien.telemedizin.dermadoc.app.general_entities.casedata.CaseData caseData, long caseId) {
    caseData.setId(getCaseDataId());
    java.util.List<at.tuwien.telemedizin.dermadoc.app.general_entities.casedata.CaseData> cDList = caseDataMap.get(caseId);
    if (cDList == null) {
        cDList = new java.util.ArrayList<>();
    }
    cDList.add(caseData);
    caseDataMap.put(caseId, cDList);
    return caseData;
}