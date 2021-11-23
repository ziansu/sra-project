@java.lang.Override
public boolean onLongClick(android.view.View view) {
    if ((rowItem.getEntry()) != null) {
        toggleChecked(position1, holder.checkImageView);
    }
    return true;
}