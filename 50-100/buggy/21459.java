public void setSelectedData(com.dbms.entity.cqt.CmqBase190 selectedData) {
    if (selectedData == null) {
        selectedData = new com.dbms.entity.cqt.CmqBase190();
        isSelectedDataApprovedOnce = false;
    }else {
        this.selectedData = selectedData;
        isSelectedDataApprovedOnce = cmqBaseService.checkIfApprovedOnce(selectedData.getCmqCode());
    }
}