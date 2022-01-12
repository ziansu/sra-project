@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    currentName = ((android.widget.EditText) (view.findViewById(R.id.editText_website_name))).getText().toString();
    currentURL = ((android.widget.EditText) (view.findViewById(R.id.editText_website_url))).getText().toString();
    presenter.onClickAddWebsite(currentName, currentURL);
    dismiss();
}