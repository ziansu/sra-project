@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_crash_if_unknown_view_class() {
    io.nlopez.smartadapters.builders.DefaultBindableLayoutBuilder builder = new io.nlopez.smartadapters.builders.DefaultBindableLayoutBuilder();
    int viewType = io.nlopez.smartadapters.utils.Mapper.viewTypeFromViewClass(builder.viewType(new java.lang.Object(), 0, mapper));
    android.view.View bindableLayout = builder.build(parent, viewType, null, mapper);
}