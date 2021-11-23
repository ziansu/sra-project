@java.lang.Override
public void update(double time) {
    mouseSnap = mouse.getSnapShot();
    if (!(mouseSnap.isFocused()))
        return ;
    
    player.backup();
    float sec = ((float) (time));
    displacement.clear();
    gravityVel += (gravityConst) * sec;
    displacement.add(gravityDir.getPoint(gravityVel));
    player.move(displacement.getPoint(spriteScale));
}