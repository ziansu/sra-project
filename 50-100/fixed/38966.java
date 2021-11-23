@java.lang.Override
protected void onPostExecute(java.util.HashMap<java.lang.String, java.lang.String> strings) {
    if ((strings != null) && ((strings.size()) > 0)) {
        courseList.clear();
        courseIdList.clear();
        courseNameList.clear();
        courseList.putAll(strings);
        courseNameList.addAll(strings.keySet());
        courseIdList.addAll(strings.values());
        courseAdapter.notifyDataSetChanged();
    }else {
        exitEarly();
    }
}