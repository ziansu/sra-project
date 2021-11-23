@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (!(com.extenprise.mapp.net.AppStatus.getInstance(getContext()).isOnline())) {
        com.extenprise.mapp.util.Utility.showMessage(getContext(), R.string.error_not_online);
        return ;
    }
    android.content.Intent intent = new android.content.Intent(getContext(), com.extenprise.mapp.service.activity.AppointmentDetailsActivity.class);
    intent.putExtra("appont", mList.get(position));
    getContext().startActivity(intent);
}