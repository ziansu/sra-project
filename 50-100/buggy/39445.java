@org.junit.Test
public void referenceTest() {
    org.junit.Assert.assertThat("Tested List is not empty", processorsList, org.hamcrest.core.Is.is(org.hamcrest.core.IsNull.notNullValue()));
    org.junit.Assert.assertThat("Reference should be injected.", manager, org.hamcrest.core.Is.is(org.hamcrest.core.IsNull.notNullValue()));
    java.util.List<pl.hycom.jira.plugins.gitlab.integration.model.Commit> list = new java.util.ArrayList<>();
    list.add(new pl.hycom.jira.plugins.gitlab.integration.model.Commit());
    manager.startProcessors(list);
}