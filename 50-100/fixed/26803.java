@java.lang.Override
public java.lang.Integer get(int index) {
    if ((index < (size())) && (index >= 0))
        return super.get(index);
    else
        if ((((com.apps.philipps.source.BreathData.LimitedList.saveData) != null) && ((size()) == (com.apps.philipps.source.BreathData.ramSize))) && (index >= (com.apps.philipps.source.BreathData.ramSize)))
            return 1;
        else
            return null;
        
    
}