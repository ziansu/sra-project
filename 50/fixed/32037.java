@com.arthur_markus.SampleWebsite.Mappers.Insert(value = "INSERT INTO T_CALL (CALLER, RECEIVER) VALUES ('${caller}', '${receiver}')")
void insetDataIntoCallTable(@com.arthur_markus.SampleWebsite.Mappers.Param(value = "caller")
int caller, @com.arthur_markus.SampleWebsite.Mappers.Param(value = "receiver")
int receiver);