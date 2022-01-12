@java.lang.Override
public void unapply(com.robin.magic_realm.components.effect.SpellEffectContext context) {
    if (context.Spell.getGameObject().hasThisAttribute(_effectName)) {
        context.Target.getGameObject().removeThisAttribute(_effectName);
    }
}