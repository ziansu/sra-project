@java.lang.Override
public void onClick(android.view.View v) {
    if (!(listCheckBox.get(position))) {
        holder.checkBoxSelected.setChecked(true);
        listCheckBox.set(position, true);
    }else
        if (listCheckBox.get(position)) {
            holder.checkBoxSelected.setChecked(false);
            listCheckBox.set(position, false);
        }
    
}