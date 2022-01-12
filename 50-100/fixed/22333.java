@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(getContext(), com.extenprise.mapp.service.activity.AppointmentDetailsActivity.class);
    intent.putExtra("appont", mList.get(position));
    getContext().startActivity(intent);
}