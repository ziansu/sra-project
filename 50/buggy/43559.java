@java.lang.Override
public E convertToModel(D view) {
    E model = getModelInstance(view);
    model.setId(view.getId());
    return model;
}