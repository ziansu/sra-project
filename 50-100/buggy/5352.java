@java.lang.Override
public void run() {
    if ((snake) != null) {
        com.example.stevennl.tastysnake.model.Direction dir = sensorCtrl.getDirection();
        if (!(snake.move(dir))) {
            finish();
        }
        android.util.Log.d(com.example.stevennl.tastysnake.ui.test.DrawableGridTestActivity.TAG, ("run: " + dir));
        map.createFood((lengthen = !(lengthen)));
    }
}