@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_crash_if_unknown_view_class() {
    io.nlopez.smartadapters.builders.AABindableLayoutBuilder builder = new io.nlopez.smartadapters.builders.AABindableLayoutBuilder();
    int viewType = mapper.viewTypeFromViewClass(builder.viewType(0, 0, mapper));
    android.view.View bindableLayout = builder.build(parent, 0, null, mapper);
}