@java.lang.Override
public void onBindViewHolder(com.loyalium.cpuloyal.tipcalc.adapters.TipAdapter.TipViewHolder holder, int position) {
    com.loyalium.cpuloyal.tipcalc.models.TipRecord element = dataset.get(position);
    java.lang.String strTip = java.lang.String.format(context.getString(R.string.global_message_tip), element.getTip());
    holder.txtContent.setText(strTip);
    holder.setOnItemClickListener(element, onItemClickListener);
}