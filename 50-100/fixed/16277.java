@java.lang.Override
public void onClick(android.view.View view) {
    components.remove(position);
    notifyDataSetChanged();
    android.widget.Toast.makeText(activity.getBaseContext(), activity.getResources().getString(R.string.removed), Toast.LENGTH_SHORT).show();
    if ((components.size()) < 1) {
        android.widget.Button calcualateBtn = ((android.widget.Button) (activity.findViewById(R.id.btn_calculate)));
        calcualateBtn.setEnabled(false);
    }
}