@java.lang.Override
public void onClick(android.view.View v) {
    if (((android.widget.CheckBox) (v)).isChecked()) {
        v.setSelected(true);
        objectItem.setChecked(true);
    }else {
        v.setSelected(false);
        objectItem.setChecked(false);
    }
    data.set(position, objectItem);
}