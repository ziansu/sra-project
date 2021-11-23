@java.lang.Override
public void onButtonClickListener(int position, java.lang.String value) {
    android.widget.Toast.makeText(getContext(), ("Button click " + value), Toast.LENGTH_SHORT).show();
    onDeleteButtonClicked(position, value);
}