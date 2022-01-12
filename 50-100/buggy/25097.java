@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.weste.time_keper1.UpdateTaskActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt("ID_Task", id);
    intent.putExtra("mybackage", bundle);
    startActivity(intent);
    android.widget.Toast.makeText(this, "Clicked Edit", Toast.LENGTH_SHORT).show();
    mBottomSheetDialog.dismiss();
}