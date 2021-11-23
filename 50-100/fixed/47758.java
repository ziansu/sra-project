@java.lang.Override
public eis.iilang.Percept performAction(final eis.iilang.Action action) throws eis.eis2java.exception.TranslationException {
    contextvh.actions.CustomAction customAction = customActions.get(action);
    if (customAction != null) {
        return customAction.call(this, action.getParameters());
    }else {
        return super.performAction(action);
    }
}