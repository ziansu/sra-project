@java.lang.Override
public void onClick(android.view.View v) {
    if (savedListHolder.resIsContained(restaurant)) {
        removeSaved(position);
        holder.saveButton.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(context, R.drawable.star_not));
        return ;
    }
    addToSavedList(restaurant);
    holder.saveButton.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(context, R.drawable.star_filled));
}