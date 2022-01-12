public void setValue(float[] value) {
    for (int i = 0; i < (value.length); ++i)
        elements.getEffectParameter(i).setValue(value[i]);
    
    stateKey = ++(jMono_Framework.graphics.effect.EffectParameter.NextStateKey);
}