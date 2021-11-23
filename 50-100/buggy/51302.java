@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    java.lang.System.out.println(((screenX + " ") + screenY));
    java.lang.String action = getTouchAction(screenX, screenY);
    if (action.equals("pause"))
        pause();
    else
        if (action.equals("jump"))
            hero.jump();
        else
            hero.roll(action);
        
    
    return true;
}