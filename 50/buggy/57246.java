@java.lang.Override
public void onMouseDown(sut.game01.core.Mouse.ButtonEvent event) {
    finish.score(t, d, ((sut.game01.core.TestScreen) (ss.top())));
    ss.push(finish);
}