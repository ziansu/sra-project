@java.lang.Override
public void onClick(android.view.View v) {
    if (zillaAdapterButtonClickListener != null) {
        zillaAdapterButtonClickListener.onZillaAdapterButtonClick(((zilla.libcore.ui.util.Button) (v)), position);
    }
}