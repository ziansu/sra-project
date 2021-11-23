@java.lang.Override
public void callback(boolean success, final java.util.ArrayList<java.lang.String> images) {
    android.widget.GridView gridView = ((android.widget.GridView) (view.findViewById(R.id.gridView)));
    gridView.setAdapter(new com.mobileproto.jovanduy.photofeed.ImageAdapter(getContext(), images));
    gridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            openAdder(images.get(position));
        }
    });
    links = images;
}