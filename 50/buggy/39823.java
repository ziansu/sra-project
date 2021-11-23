protected int parseComponentStrength(java.lang.String strength) {
    switch (strength) {
        case "MAX" :
            return uk.ac.aber.gij2.olandroid.visualisation.Component.MAX;
        case "ZERO" :
            return uk.ac.aber.gij2.olandroid.visualisation.Component.ZERO;
        case "MIN" :
            return uk.ac.aber.gij2.olandroid.visualisation.Component.MIN;
    }
    return uk.ac.aber.gij2.olandroid.visualisation.Component.ZERO;
}