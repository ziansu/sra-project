@java.lang.Override
public void onClick(android.view.View v) {
    if (zillaAdapterButtonClickListener != null) {
        zillaAdapterButtonClickListener.onZillaAdapterButtonClick(((android.widget.Button) (v)), position);
    }
}