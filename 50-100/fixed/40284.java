@java.lang.Override
public void onDialogPositiveClick(android.app.DialogFragment dialog) {
    android.widget.EditText eventNameText = ((android.widget.EditText) (dialog.getDialog().findViewById(R.id.eventname)));
    if (((eventNameText != null) && ((eventNameText.getText()) != null)) && ((eventNameText.getText().toString()) != "")) {
        addEvent(eventNameText.getText().toString());
    }else
        android.util.Log.d(com.aayaffe.sailingracecoursemanager.ChooseEventActivity.TAG, "Event not(!) created.");
    
}