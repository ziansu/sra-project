public void deregister(cardgame.TriggerAction a) {
    for (int i = actions.size(); i >= 0; --i) {
        if (a.equals(actions.get(i))) {
            actions.remove(i);
        }
    }
}