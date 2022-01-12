@java.lang.Override
public void onComplete() {
    btnUpdateRecord.setProgress(0);
    editGrowthRecord();
    android.content.Intent intent = new android.content.Intent(this, com.example.zhenyu.babyrecordapplication.Activities.MyBabies.GrowthDetailsActivity.class);
    intent.putExtra("baby", baby);
    intent.putExtra("growth_rec", babyGrowthRec);
    setResult(com.example.zhenyu.babyrecordapplication.Activities.MyBabies.RESULT_OK, intent);
    finish();
}