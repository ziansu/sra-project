@android.support.annotation.NonNull
public rx.Observable<com.github.st1hy.countthemcalories.database.IngredientTemplate> saveIntoDatabase() {
    java.util.List<com.github.st1hy.countthemcalories.activities.addingredient.fragment.model.IngredientTypeCreateException.ErrorType> errorList = canCreateIngredient();
    if (errorList.isEmpty()) {
        return insertOrUpdateIntoDatabase();
    }else {
        return rx.Observable.error(new com.github.st1hy.countthemcalories.activities.addingredient.fragment.model.IngredientTypeCreateException(errorList));
    }
}