@java.lang.Override
public com.macys.valuesobjects.BaseDTO createDTO() {
    com.macys.valuesobjects.ReleaseCupVo vo = new com.macys.valuesobjects.ReleaseCupVo();
    vo.name = this.getName();
    vo.type = this.getType();
    vo.uuid = this.getUuid();
    vo.createdOnISO8601 = com.macys.utils.AppUtils.getDateISO8601(this.getCreatedOn());
    vo.availableDevDays = this.getAvailableDevDays();
    vo.devDays = this.getDevDays();
    vo.regressionDays = this.getRegressionDays();
    vo.matrixJson = this.getMatrixJson();
    return vo;
}