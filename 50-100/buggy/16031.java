@java.lang.Override
public void onClick(android.view.View v) {
    org.lvu.model.Data data = mData.get(((holder.getAdapterPosition()) >= (mData.size()) ? (mData.size()) - 1 : holder.getAdapterPosition()));
    mOnItemClickListener.onClick(data.getUrl(), data.getText());
}