@java.lang.Override
public void bind(com.jhj.expandablerecyclerviewexample.model.Parent data) {
    java.lang.String info = data.getInfo();
    android.widget.TextView tv_info = getView(R.id.info);
    tv_info.setText(info);
    getView(R.id.dot).setBackgroundColor(data.getDot());
    getView(R.id.arrow).setRotation((isExpanded() ? 180 : 0));
    com.jhj.expandablerecyclerview.utils.Logger.e(com.jhj.expandablerecyclerviewexample.viewholder.BaseParentViewHolder.TAG, ("***********bind**************>>" + (getAdapterPosition())));
}