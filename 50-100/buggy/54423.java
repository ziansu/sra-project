private static int getDecision(int indice, int mechanicsClass) {
    switch (mechanicsClass) {
        case Intelligence.Mechanics.mechanicsClasses.UNDER_BET_CLASS :
            if (indice == 0)
                return decisionClasses.CALL_CLASS;
            
        case Intelligence.Mechanics.mechanicsClasses.EQUALS_BET_CLASS :
            if (indice == 0)
                return decisionClasses.CHECK_CLASS;
            else
                return decisionClasses.RAISE_CLASS;
            
        case Intelligence.Mechanics.mechanicsClasses.OVER_BET_CLASS :
            if (indice == 0)
                return decisionClasses.CALL_CLASS;
            else
                return decisionClasses.RAISE_CLASS;
            
        default :
            return -1;
    }
}