@org.junit.Test
public void whenLongClickingOnView_ThenInvokeCommand() {
    robobinding.binding.viewattribute.OnLongClickAttribute onLongClickAttribute = new robobinding.binding.viewattribute.OnLongClickAttribute(view, commandName);
    onLongClickAttribute.bind(mockPresentationModelAdapter, context);
    view.performLongClick();
    org.junit.Assert.assertTrue(mockFunction.commandInvoked);
}