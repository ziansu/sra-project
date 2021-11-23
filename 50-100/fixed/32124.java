public void validate() {
    if (isValid = (((attack) != 0) | ((defence) != 0)) | ((speed) != 0)) {
        category = ((byte) (Equipment.equipment[id].type.id));
    }
    isValid = (isValid) && ((category) != (-1));
}