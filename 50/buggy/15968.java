@java.lang.Override
public void onCreated(int mProgram) {
    for (com.yezi.testmedia.filter.BaseFilter filter : mFilterList) {
        filter.onSurfaceCreated(null, null);
    }
}