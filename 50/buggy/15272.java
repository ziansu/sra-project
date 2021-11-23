@com.wantscart.jade.annotation.SQL(value = ((("DELETE " + (TableSchema.TEMPLATE_TABLE)) + " WHERE ") + (TableSchema.TEMPLATE_PK)) + " = :_id", type = com.wantscart.jade.annotation.SQLType.TEMPLATE)
int g(@com.wantscart.jade.annotation.SQLParam(value = "_id")
java.lang.Number id);