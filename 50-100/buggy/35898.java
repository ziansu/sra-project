public void keyPressed(int keyPressed) {
    switch (keyPressed) {
        case Input.Keys.SPACE :
            if (model.isFirstShakeDone()) {
                model.firstShake();
            }else {
                model.endChug();
            }
            break;
        case Input.Keys.LEFT :
            model.shake(ShakeDirection.LEFT);
            break;
        case Input.Keys.RIGHT :
            model.shake(ShakeDirection.RIGHT);
            break;
    }
}