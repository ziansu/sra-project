@java.lang.Override
public void onClick(android.view.View v) {
    if (!isThisChecked) {
        holder.checkBoxSelected.setChecked(true);
        listCheckBox.set(position, true);
    }else
        if (isThisChecked) {
            holder.checkBoxSelected.setChecked(false);
            listCheckBox.set(position, false);
        }
    
}