@java.lang.Override
public void act(float delta) {
    super.act(delta);
    hitbox.translate(linearVelocity.x, linearVelocity.y);
    if ((blocking) && (!(stage.hash.spaceFree(hitbox, this))))
        hitbox.translate((-(linearVelocity.x)), (-(linearVelocity.y)));
    
}