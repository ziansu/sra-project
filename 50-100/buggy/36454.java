@android.support.annotation.NonNull
public Model value() throws com.github.gfx.android.orma.exception.NoValueException {
    Model model;
    if ((offset) != (-1)) {
        model = getOrNull(offset);
    }else {
        model = getOrNull(0);
    }
    if (model == null) {
        throw new com.github.gfx.android.orma.exception.NoValueException(("Expected single get but nothing for " + (com.github.gfx.android.orma.Selector.getSchema().getTableName())));
    }
    return model;
}