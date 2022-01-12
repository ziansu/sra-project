@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((player) != null) {
        player.release();
        currentState = com.trojx.fangyan.fragment.StoryFragment.STATUS_IDLE;
    }
    android.content.Intent intent = new android.content.Intent(getActivity(), com.trojx.fangyan.activity.StoryActivity.class);
    java.lang.String AVObject = storyList.get(position).toString();
    intent.putExtra("AVObject", AVObject);
    startActivity(intent);
}