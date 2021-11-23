@java.lang.Override
public void onClear() {
    if ((customGuardian) != null)
        customGuardian.dead = true;
    
    be.isach.ultracosmetics.v1_11_R1.morphs.MorphElderGuardian.customEntities.remove(customGuardian);
}