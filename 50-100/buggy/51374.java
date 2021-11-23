public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String title = input.getText().toString();
    if ((title.length()) == 1)
        return ;
    else {
        d.setName(title);
        if (state.isChecked()) {
            mDoneTaskList.add(d);
            android.widget.Toast.makeText(getActivity(), "Added in the done list", Toast.LENGTH_LONG).show();
        }else {
        }
        donetodoAdapter.notifyDataSetChanged();
    }
}