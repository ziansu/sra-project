@java.lang.Override
public void onActivated(org.terasology.rendering.nui.UIWidget widget) {
    org.terasology.entitySystem.entity.EntityRef e = null;
    java.util.ArrayList<java.lang.String> parameters = new java.util.ArrayList<java.lang.String>();
    parameters.add(searchText.getText());
    try {
        if (!(parameters.get(0).equals(""))) {
            textSearchCommand.execute(parameters, e);
            searchText.setText("");
            getManager().popScreen();
        }
    } catch (org.terasology.logic.console.commandSystem.exceptions.CommandExecutionException e1) {
    }
}