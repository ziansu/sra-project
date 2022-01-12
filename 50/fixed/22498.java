@java.lang.Override
public void onBindViewHolder(com.lufficc.demolightadapter.model.BigImgModel model, com.lufficc.demolightadapter.viewprovider.BigImgViewProvider.HeaderViewHolder viewHolder, int position) {
    viewHolder.textView.setText(model.getInfo());
}