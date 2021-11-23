@java.lang.Override
public team5.diabetesself_managmentapp.adapter.PrescriptionAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = inflater.inflate(R.layout.prescription_entry_view, parent, false);
    team5.diabetesself_managmentapp.adapter.PrescriptionAdapter.ViewHolder viewHolder = new team5.diabetesself_managmentapp.adapter.PrescriptionAdapter.ViewHolder(view);
    formatter = new java.text.SimpleDateFormat("MM/dd/yyyy");
    viewHolder.etDate.setText(formatter.format(cal.getTime()));
    formatter = new java.text.SimpleDateFormat("hh:mm:aa");
    viewHolder.etTime.setText(formatter.format(cal.getTime()));
    vh.add(viewHolder);
    return viewHolder;
}