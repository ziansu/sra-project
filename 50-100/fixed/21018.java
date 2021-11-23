@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    if (myWorld.isReady()) {
        myWorld.start();
    }else
        if (myWorld.isRunning()) {
            myBola.touchDown();
        }
    
    return true;
}