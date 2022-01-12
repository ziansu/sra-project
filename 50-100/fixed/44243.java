public void updateValue(double value) {
    double adjusted = value * (scale);
    if ((lastValue) == adjusted)
        return ;
    
    lastValue = adjusted;
    if (com.simsilica.lemur.input.InputMapper.log.isTraceEnabled())
        com.simsilica.lemur.input.InputMapper.log.trace(((("Value changed for:" + (function)) + " scale:") + (scale)));
    
    com.simsilica.lemur.input.InputState state = valueToState(adjusted);
    updateState(state);
}