@org.junit.Test
public void test1() throws java.lang.Throwable {
    net.d80harri.wr.service.model.TaskDto root = new net.d80harri.wr.service.model.TaskDto("root");
    root.addChild(new net.d80harri.wr.service.model.TaskDto("firstChild"));
    root.addChild(new net.d80harri.wr.service.model.TaskDto("secondChild"));
    net.d80harri.wr.ui.viewmodel.TaskViewModel model = new net.d80harri.wr.ui.viewmodel.TaskViewModel(root, null, true);
    assertThat(model.getChildrenViews()).hasSize(2);
    model.addNewChild();
    assertThat(model.getChildrenViews()).hasSize(3);
}