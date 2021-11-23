@java.lang.Override
public D convertToView(E model) {
    D view = getViewInstance(model);
    view.setId(model.getId());
    return view;
}