public void updateAssociatedSets(de.uni.freiburg.iig.telematik.swat.jascha.UpdateType type) {
    switch (type) {
        case DECREASE :
            if ((associatedSets) < 1) {
                throw new de.invation.code.toval.validate.ParameterException("Can't decrease because the SimpleResource is not part of a ResourceSet");
            }
            if ((associatedSets) >= 1) {
                (associatedSets)--;
            }
            break;
        case INCREASE :
            (associatedSets)++;
            break;
    }
}