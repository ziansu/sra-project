@org.apache.ibatis.annotations.Select(value = "select * from info_shareholder where sto_id=#{stockId} order by issue_date desc limit 1")
@org.apache.ibatis.annotations.ResultMap(value = "infoShareholderResultMap")
org.polar.athena.domain.InfoShareholder getLatest(@org.apache.ibatis.annotations.Param(value = "stockId")
int stockId);