@org.junit.Test
public void tasks_sonarrunner_depens_on_results_in_item_setup_of_task_sonarrunner_depends_on() throws java.lang.Exception {
    java.lang.String text = "tasks.sonarrunner.dependson check";
    java.io.InputStream is = new java.io.ByteArrayInputStream(text.getBytes());
    de.jcup.egradle.core.model.groovyantlr.GradleModelBuilder b = new de.jcup.egradle.core.model.groovyantlr.GradleModelBuilder(is);
    de.jcup.egradle.core.model.Model model = b.build(null);
    de.jcup.egradle.core.model.Item[] items = model.getRoot().getChildren();
    assertEquals(1, items.length);
    de.jcup.egradle.core.model.Item taskSetupItem = items[0];
    assertEquals("tasks.sonarrunner.dependson check", taskSetupItem.getName());
    assertEquals(ItemType.TASKS, taskSetupItem.getItemType());
}