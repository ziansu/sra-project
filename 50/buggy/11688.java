@java.lang.Override
public void onTestCreated(app.studentorganizer.entities.Test test) {
    mTests.add(test);
    mAdapter.notifyDataSetChanged();
}