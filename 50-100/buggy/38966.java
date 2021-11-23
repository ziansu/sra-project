@java.lang.Override
protected void onPostExecute(java.util.HashMap<java.lang.String, java.lang.String> strings) {
    if ((strings != null) && ((strings.size()) > 0)) {
        courseList.clear();
        courseIdList.clear();
        courseNameList.clear();
        courseList.putAll(strings);
        courseNameList.addAll(strings.values());
        courseIdList.addAll(strings.keySet());
        courseAdapter.notifyDataSetChanged();
    }else {
        exitEarly();
    }
}