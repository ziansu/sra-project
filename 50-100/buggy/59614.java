@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(v.getContext(), "edit clicked", Toast.LENGTH_LONG).show();
    com.example.zhenyu.babyrecordapplication.Models.BabyGrowthRecord growthRec = listData.get(position);
    java.lang.System.out.println(("growth id: " + (growthRec.getGrowthId())));
    android.content.Intent addActivityIntent = new android.content.Intent(context, com.example.zhenyu.babyrecordapplication.Activities.MyBabies.EditGrowthRecordActivity.class);
    addActivityIntent.putExtra("baby", baby);
    addActivityIntent.putExtra("babyGrowthRec", growthRec);
    ((android.app.Activity) (context)).startActivityForResult(addActivityIntent, com.example.zhenyu.babyrecordapplication.Utils.CustomGrowthAdapter.EDIT_GROWTH);
}