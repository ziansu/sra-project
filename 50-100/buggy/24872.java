@java.lang.Override
public void onEventClick(com.alamkanak.weekview.WeekViewEvent event, android.graphics.RectF eventRect) {
    android.widget.Toast.makeText(getActivity(), ("Clicked " + (event.getName())), Toast.LENGTH_SHORT).show();
    getFragmentManager().beginTransaction().replace(R.id.container, new com.example.jason.myclass.CourseSearch.SearchFragment(event.getName().split(java.lang.System.getProperty("line.separator"))[0])).addToBackStack("7").commit();
}