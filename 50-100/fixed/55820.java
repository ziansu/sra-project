@java.lang.Override
public java.lang.String errorMsgOnData(@org.jetbrains.annotations.NotNull
java.lang.String data) {
    java.lang.String sup = super.errorMsgOnData(data);
    if (sup != null) {
        return sup;
    }
    if (((initialMacro) != null) && (!(initialMacro.getKey().equals(data)))) {
        if ((com.kaylerrenslow.armaDialogCreator.data.Project.getCurrentProject().findMacroByKey(data)) != null) {
            return bundle.getString("Macros.key_already_exists");
        }
    }
    return null;
}