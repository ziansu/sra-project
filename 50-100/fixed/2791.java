@java.lang.Override
protected void processEntity(com.badlogic.ashley.core.Entity entity, float deltaTime) {
    final com.steftmax.temol.component.TransformComponent tc = tm.get(entity);
    final com.steftmax.temol.component.WeldComponent wc = wm.get(entity);
    calculateAffine2(tc.transform, tc.position, tc.origin, tc.scale, tc.rotation);
    if (wc != null)
        calculateAffine2(wc.transform, wc.position, wc.origin, wc.scale, wc.rotation);
    
}