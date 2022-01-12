@java.lang.Override
public void onStart() {
    super.onStart();
    android.content.Intent i = getIntent();
    int position = i.getIntExtra("position", 0);
    com.example.futin.importimages.UserInterface.SingleImageAdapter adapter = new com.example.futin.importimages.UserInterface.SingleImageAdapter(this);
    viewPager.setAdapter(adapter);
    viewPager.setCurrentItem(position);
}