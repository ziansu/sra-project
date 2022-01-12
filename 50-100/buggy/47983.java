public java.util.List<pokinboroda.andriy.com.foxhunting.model.GameAreaField> getGameAreaFields() {
    java.util.List<pokinboroda.andriy.com.foxhunting.model.GameAreaField> listFields = new java.util.ArrayList<>();
    for (int i = 0; i < (pokinboroda.andriy.com.foxhunting.model.GameModel.AREA_DIMENSION); i++) {
        for (int j = 0; j < (pokinboroda.andriy.com.foxhunting.model.GameModel.AREA_DIMENSION); j++) {
            listFields.add(fields[j][i]);
        }
    }
    return listFields;
}