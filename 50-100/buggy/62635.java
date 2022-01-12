@java.lang.Override
public boolean eventAfter(com.jhj.expandablerecyclerviewexample.viewholder.ViewHolderEventAfter event) {
    com.jhj.expandablerecyclerview.utils.Logger.e(com.jhj.expandablerecyclerviewexample.viewholder.BaseParentViewHolder.TAG, ("onEvent=" + (event.toString())));
    if ((event.triggeredEventType) == (Event.EventType.LONGCLICK)) {
        com.jhj.expandablerecyclerviewexample.utils.Util.showToast(itemView.getContext(), ((event.id) == (R.id.image) ? "image long " + "click" : "long click"));
    }
    return true;
}