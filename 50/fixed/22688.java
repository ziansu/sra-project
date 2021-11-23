@java.lang.Override
public void update(floobits.windows.AnActionEvent e) {
    if ((context) == null) {
        return ;
    }
    floobits.common.protocol.handlers.FlooHandler flooHandler = context.getFlooHandler();
    e.getPresentation().setEnabled((flooHandler == null));
}