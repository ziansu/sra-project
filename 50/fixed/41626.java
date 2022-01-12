@java.lang.Override
public void create() {
    new com.badlogic.gdx.utils.Timer().scheduleTask(new com.badlogic.gdx.utils.Timer.Task() {
        @java.lang.Override
        public void run() {
            Gdx.app.log("TimerTest", "ping");
        }
    }, 1, 1);
}