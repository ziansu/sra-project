@org.junit.Test
public void whenLongClickingOnTheView_ThenInvokeCommandWithClickEvent() {
    robobinding.binding.viewattribute.OnLongClickAttribute onLongClickAttribute = new robobinding.binding.viewattribute.OnLongClickAttribute(view, commandName);
    onLongClickAttribute.bind(mockPresentationModelAdapter, context);
    view.performLongClick();
    org.junit.Assert.assertThat(mockFunction.argsPassedToInvoke[0], org.hamcrest.CoreMatchers.instanceOf(robobinding.binding.viewattribute.ClickEvent.class));
    robobinding.binding.viewattribute.ClickEvent clickEvent = ((robobinding.binding.viewattribute.ClickEvent) (mockFunction.argsPassedToInvoke[0]));
    org.junit.Assert.assertTrue(((clickEvent.getView()) == (view)));
}