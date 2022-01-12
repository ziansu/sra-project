@java.lang.Override
public void onEventClick(com.alamkanak.weekview.WeekViewEvent event, android.graphics.RectF eventRect) {
    getFragmentManager().beginTransaction().replace(R.id.container, new com.example.jason.myclass.CourseSearch.SearchFragment(event.getName().split(java.lang.System.getProperty("line.separator"))[0])).addToBackStack("7").commit();
}