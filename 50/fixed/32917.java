public final void update(final float elapsed) {
    for (sem.group15.bubblebobble.core.objects.GameObject object : gameObjects) {
        if (!(object.remove())) {
            object.update(elapsed);
        }
    }
}