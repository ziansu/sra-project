@java.lang.Override
public void onClick(android.view.View view) {
    com.dheeraj.auctionapp.ui.adapter.AutoBotListCursorAdapter.ViewHolder holder = ((com.dheeraj.auctionapp.ui.adapter.AutoBotListCursorAdapter.ViewHolder) (checkBox.getTag()));
    if (checkBox.isChecked()) {
        mIDList.add(holder.id);
        mPriceList.add(holder.price);
    }else {
    }
}