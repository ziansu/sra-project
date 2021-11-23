public void onClick(android.view.View v) {
    extractedTitle = path.getText().toString().substring(path.getSelectionStart(), path.getSelectionEnd()).trim();
    if ((extractedTitle.length()) > 0) {
        title.setText(extractedTitle);
    }else {
        title.setText(getResources().getString(R.string.title));
    }
}