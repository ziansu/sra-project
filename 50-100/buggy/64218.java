@java.lang.Override
public void onClick(android.view.View v) {
    deleteLineNumber(add.getText().toString());
    getFragmentManager().beginTransaction().replace(R.id.main_fragment_container, ahager3.calendarapp.EditFragment.newInstance(day)).addToBackStack(null).commit();
}