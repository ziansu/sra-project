@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, final int position) {
    if (holder instanceof materialtest.sanjose.venkata.adapters.InformationAdapter.GravatarHolder) {
    }else {
        materialtest.sanjose.venkata.adapters.InformationAdapter.ItemHolder itemHolder = ((materialtest.sanjose.venkata.adapters.InformationAdapter.ItemHolder) (holder));
        materialtest.sanjose.venkata.model.Information currentData = dataInformation.get(position);
        android.util.Log.i("Venkata", ("On Bind View Holder at " + position));
        itemHolder.title.setText(currentData.title);
        itemHolder.icon.setImageResource(currentData.iconId);
    }
}