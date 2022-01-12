@java.lang.Override
public void onClick(int position) {
    android.content.Intent intent = new android.content.Intent(this, com.example.yukinohara.accuweather.ui.base.DetailsActivity.class);
    intent.putExtra("INDEX", position);
    startActivity(intent);
}