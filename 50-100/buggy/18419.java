private se.uu.ub.cora.bookkeeper.data.DataGroup createRecordInfo() {
    se.uu.ub.cora.bookkeeper.data.DataGroup recordInfo = se.uu.ub.cora.bookkeeper.data.DataGroup.withNameInData("recordInfo");
    recordInfo.addChild(se.uu.ub.cora.bookkeeper.data.DataAtomic.withNameInDataAndValue("id", "book1"));
    recordInfo.addChild(se.uu.ub.cora.bookkeeper.data.DataAtomic.withNameInDataAndValue("type", "book"));
    se.uu.ub.cora.bookkeeper.data.DataGroup type = se.uu.ub.cora.bookkeeper.testdata.DataCreator.createRecordLinkGroupWithNameInDataAndRecordTypeAndRecordId("type", "recordType", "book");
    recordInfo.addChild(type);
    se.uu.ub.cora.bookkeeper.data.DataGroup dataDivider = se.uu.ub.cora.bookkeeper.testdata.DataCreator.createRecordLinkGroupWithNameInDataAndRecordTypeAndRecordId("dataDivider", "system", "testSystem");
    recordInfo.addChild(dataDivider);
    return recordInfo;
}