public void würfeln() {
    for (int x = 0; x < (view.WürfelPL1.size()); x++) {
        if (!(view.WürfelPL1.get(x).isSelected())) {
            view.WürfelPL1.get(x).roll();
            java.lang.System.out.println(view.WürfelPL1.get(x));
        }
    }
    server.sendObject(new message.WürfelRoll(view.WürfelPL1));
}