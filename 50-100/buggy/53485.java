public void würfeln() {
    for (int x = 0; x < (view.WürfelPL1.size()); x++) {
        if (!(view.WürfelPL1.get(x).isSelected())) {
            view.WürfelPL1.get(x).roll();
            view.WürfelPL1.set(x, view.WürfelPL1.get(x));
        }
    }
    server.sendObject(new message.WürfelRoll(view.WürfelPL1));
}