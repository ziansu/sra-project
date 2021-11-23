@java.lang.Override
public eis.iilang.Percept performAction(final eis.iilang.Action action) throws eis.eis2java.exception.TranslationException {
    java.lang.System.out.println(action);
    contextvh.actions.CustomAction customAction = customActions.get(action);
    if (customAction != null) {
        return customAction.call(this, action.getParameters());
    }else {
        return super.performAction(action);
    }
}