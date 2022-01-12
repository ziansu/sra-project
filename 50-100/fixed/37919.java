@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.stgobain.samuha.activity.TodayEventActivity.class);
    intent.putExtra("Tittle", "Family Day 2");
    intent.putExtra("Type", "family_day_2");
    intent.putExtra("From", "Event");
    getContext().startActivity(intent);
}