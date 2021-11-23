public void nextPreset(nl.tudelft.contextproject.script.Shot oldShot) {
    int oldIndex = shots.indexOf(oldShot);
    if ((oldIndex + 1) < (shots.size())) {
        nl.tudelft.contextproject.script.Shot nextShot = shots.get((oldIndex + 1));
        if ((nextShot.getPreset()) != null) {
            nextShot.getPreset().applyTo(camera);
        }
    }
}