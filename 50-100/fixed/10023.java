private void effect() {
    for (int i = (effects.size()) - 1; i >= 0; i--) {
        effects.get(i).update(this);
    }
    for (int i = (effects.size()) - 1; i >= 0; i--) {
        if (effects.get(i).killMe) {
            effects.get(i).end(this);
            effects.remove(i);
        }
    }
}