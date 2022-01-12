@java.lang.Override
public void onTouched(nl.joozey.shapeshifter.gameobject.GameObject gameObject) {
    if (gameObject instanceof nl.joozey.shapeshifter.gameobject.FairyBlimp) {
        _jeff.setPower(7);
        _jeff.rainbow(10);
        setMessage("The surge feels empty.");
        _startFinalBattle();
    }
    if (((_rinn.getStage()) == 0) && (gameObject instanceof nl.joozey.shapeshifter.gameobject.Rinn)) {
        ((nl.joozey.shapeshifter.gameobject.Rinn) (gameObject)).moveRight();
    }
}