@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_crash_if_not_aa() {
    io.nlopez.smartadapters.builders.AABindableLayoutBuilder builder = new io.nlopez.smartadapters.builders.AABindableLayoutBuilder();
    int viewType = io.nlopez.smartadapters.utils.Mapper.viewTypeFromViewClass(builder.viewType(mockModel, 0, mapper));
    android.view.View bindableLayout = builder.build(parent, viewType, mockModel, mapper);
}