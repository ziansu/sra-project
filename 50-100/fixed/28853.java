public void removeResourceFromSet(de.uni.freiburg.iig.telematik.swat.jascha.Resource item) {
    de.uni.freiburg.iig.telematik.swat.jascha.SimpleResource sr = ((de.uni.freiburg.iig.telematik.swat.jascha.SimpleResource) (item));
    if ((sr.getAssociatedResourceSets()) < 1) {
        throw new de.invation.code.toval.validate.ParameterException("Can't remove resource from set because it's not part of one");
    }
    if ((sr.getAssociatedResourceSets()) >= 1) {
        sr.updateAssociatedSets(UpdateType.DECREASE);
        resources.remove(item);
    }
}