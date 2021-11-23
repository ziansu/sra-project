@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    com.example.bchan92.homework1.DynamicFragment.ViewHolder holder = new com.example.bchan92.homework1.DynamicFragment.ViewHolder(view);
    view.setTag(holder);
    holder.contact_name.setText(this.contact_name);
    holder.address.setText(this.address);
    holder.birth_date.setText(java.lang.String.format("%s/%s/%s", month, day, year));
    holder.birth_date.setOnClickListener(this);
}