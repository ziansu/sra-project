@java.lang.Override
public void ttProcessFinish(org.json.JSONArray jsonArray) {
    java.lang.System.out.println(("ScheduleFragment gets jsonarray: " + jsonArray));
    com.example.juho.unigamesproject.ScheduleFragment.JSONSorter jsonSorter = new com.example.juho.unigamesproject.ScheduleFragment.JSONSorter(this.getContext());
    jsonSorter.execute(jsonArray);
}