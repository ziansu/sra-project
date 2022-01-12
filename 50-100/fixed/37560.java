@org.junit.Test
public void test_build() {
    io.nlopez.smartadapters.builders.DefaultBindableLayoutBuilder builder = new io.nlopez.smartadapters.builders.DefaultBindableLayoutBuilder();
    int viewType = mapper.viewTypeFromViewClass(builder.viewType(mockModel, 0, mapper));
    android.view.View bindableLayout = builder.build(parent, viewType, mockModel, mapper);
    junit.framework.Assert.assertNotNull(bindableLayout);
    junit.framework.Assert.assertTrue((bindableLayout instanceof io.nlopez.smartadapters.mocks.MockLayout));
}