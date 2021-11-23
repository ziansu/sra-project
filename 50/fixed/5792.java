public void init(android.content.Context context) {
    if ((modelSql) == null) {
        modelSql = new com.example.nofarcohenzedek.dogo.Model.Sql.ModelSql(context);
    }
    if ((modelParse) == null) {
        modelParse = new com.example.nofarcohenzedek.dogo.Model.Parse.ModelParse(context);
    }
}