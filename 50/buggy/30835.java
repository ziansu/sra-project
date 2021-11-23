@java.lang.Override
public void onClick(android.view.View view) {
    boolean checked = ((android.widget.CheckBox) (view)).isChecked();
    object.setChecked((!checked));
}