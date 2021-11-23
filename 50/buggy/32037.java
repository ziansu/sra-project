@com.arthur_markus.SampleWebsite.Mappers.Insert(value = "INSERT INTO T_CALL (CALLER, RECEIVER) VALUES ('${caller}', '${receiver}')")
@com.arthur_markus.SampleWebsite.Mappers.SelectKey(statement = "SELECT MAX(RECORD_ID) FROM T_CALL", keyProperty = "RECORD_ID", before = false, resultType = int.class)
int insetDataIntoCallTable(@com.arthur_markus.SampleWebsite.Mappers.Param(value = "caller")
int caller, @com.arthur_markus.SampleWebsite.Mappers.Param(value = "receiver")
int receiver);