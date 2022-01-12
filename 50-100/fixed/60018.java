@java.lang.Override
public void update(long deltaMs) {
    if (active) {
        if ((cu) != null) {
            cu.update(this, deltaMs);
        }else {
            position = position.translate(velocity.scale((deltaMs / 100.0)));
        }
    }
    age += deltaMs;
    setActivation((((age) > 0) && (alive)));
    if ((ca) != null)
        ca.animate(this, deltaMs);
    
}