@org.junit.Test
public void test_build() {
    io.nlopez.smartadapters.builders.AABindableLayoutBuilder builder = new io.nlopez.smartadapters.builders.AABindableLayoutBuilder();
    int viewType = mapper.viewTypeFromViewClass(builder.viewType(mockModel2, 0, mapper));
    android.view.View bindableLayout = builder.build(parent, viewType, mockModel2, mapper);
    junit.framework.Assert.assertNotNull(bindableLayout);
    io.nlopez.smartadapters.mocks.MockLayout2 mockLayout = ((io.nlopez.smartadapters.mocks.MockLayout2) (bindableLayout));
    junit.framework.Assert.assertTrue(mockLayout.fromBuild);
}