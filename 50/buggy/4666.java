@java.lang.Override
public void onClear() {
    super.clear();
    if ((customGuardian) != null)
        customGuardian.dead = true;
    
    be.isach.ultracosmetics.v1_11_R1.morphs.MorphElderGuardian.customEntities.remove(customGuardian);
}