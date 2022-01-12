@java.lang.Override
public D convertToView(E model) {
    if (model == null)
        return null;
    
    D view = getViewInstance(model);
    view.setId(model.getId());
    return view;
}