@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_food);
    objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    myHandler = new cn.yanweijia.slimming.FoodActivity.FoodActivityHandler();
    cn.yanweijia.slimming.dao.DBManager.initSQLiteDB(this);
    list = new java.util.ArrayList<>();
    android.content.Intent intent = getIntent();
    foodId = intent.getIntExtra("foodid", 1);
    initDatas();
}