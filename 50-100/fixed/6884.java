@java.lang.Override
public model.Cell put(model.Position key, model.Cell value) {
    model.Cell previousValue = get(key);
    remove(key);
    if (value instanceof model.ActiveCell) {
        activeCells.put(key, ((model.ActiveCell) (value)));
    }else {
        staticCells.put(key, value);
    }
    return previousValue;
}