@java.lang.Override
public void onBindViewHolder(com.piemicrosystems.bancus.ui.adapters.main.InitialProductTypeAdapter.InitialProductTypeViewholder holder, int position) {
    final com.piemicrosystems.bancus.models.InitialProductType initialProductType = products.get(position);
    holder.descriptionLabel.setText(initialProductType.getCommonName());
    holder.moreInfoLabel.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            Prompts.Dialogs.showMessageDialog(context, initialProductType.getCommonName(), initialProductType.getDescription());
        }
    });
}