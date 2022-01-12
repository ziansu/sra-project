protected client.Controller.Game.Resource selectResourceForMonopoly() {
    java.lang.String message = "Please select a resource to monopolize.";
    java.lang.String title = "Monopoly";
    client.Controller.Game.Resource[] options = new client.Controller.Game.Resource[]{ client.Controller.Game.Resource.wheat , client.Controller.Game.Resource.wood , client.Controller.Game.Resource.sheep , client.Controller.Game.Resource.ore , client.Controller.Game.Resource.brick };
    int selected = -1;
    while (selected < 0) {
        selected = javax.swing.JOptionPane.showOptionDialog(null, message, title, javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, (-1));
    } 
    return options[selected];
}