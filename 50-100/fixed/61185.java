protected boolean formDataApplicable(com.luxoft.stockexchange.emulator.entities.FixMessage currentMessage, java.util.Map<java.lang.Integer, java.lang.Object> formData) {
    if (null == formData) {
        return false;
    }
    java.lang.Object dataToSet = formData.get(this.tag);
    if ((null == dataToSet) || (!(isValidDataType(dataToSet)))) {
        return false;
    }
    setTo(currentMessage, dataToSet);
    return true;
}