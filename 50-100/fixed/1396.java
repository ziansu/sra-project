@java.lang.Override
public void onClick(android.view.View v) {
    if ((telegram) != null) {
        header.setTypeface(null, Typeface.NORMAL);
        timestamp.setTypeface(null, Typeface.ITALIC);
        alertText.setTypeface(null, Typeface.NORMAL);
        telegram.isExpanded = true;
        notifyItemChanged(getAdapterPosition());
    }
}