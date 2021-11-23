@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.view_layout);
    circularViewGroup = ((com.anitha.custom.viewgroup.CircularListViewGroup) (findViewById(R.id.viewGroup)));
    circularViewGroup.setOnItemInteractionListener(new com.anitha.custom.viewgroup.CircularListViewGroup.OnItemInteractionListener() {
        @java.lang.Override
        public void onItemClick(int position, android.view.View view) {
            android.widget.Toast.makeText(com.custom.sample.MainActivity.this, (position + " is clicked"), Toast.LENGTH_SHORT).show();
        }
    });
}