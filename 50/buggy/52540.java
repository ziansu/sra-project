@java.lang.Override
public boolean scrolled(int amount) {
    if ((cam.zoom) < 0.1)
        cam.zoom = 0.1F;
    
    return false;
}