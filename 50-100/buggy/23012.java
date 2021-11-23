@java.lang.Override
public void suffer(int damage, me.trotyl.arena.effect.Effect effect) {
    health -= damage;
    if (effect.equals(this.effect)) {
        this.effect.append(effect.getRemain());
    }else
        if (!(effect.equals(Effect.none))) {
            this.effect = effect;
        }
    
}