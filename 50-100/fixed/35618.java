@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    java.lang.String id = java.lang.String.valueOf(post_id.get(position));
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.udeys.theindianroute.ViewPostActivity.class);
    intent.putExtra("post_id", id);
    startActivity(intent);
}