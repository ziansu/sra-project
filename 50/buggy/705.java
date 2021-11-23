public void init(android.content.Context context) {
    model = new com.example.tiferet.rebook.Model.ModelParse();
    model.init(context);
    modelSql = new com.example.tiferet.rebook.Model.ModelSql(context);
}