@java.lang.Override
public boolean onLongClick(android.view.View view) {
    if ((rowItem.getEntry()) != null) {
        toggleChecked(position, holder.checkImageView);
    }
    return true;
}