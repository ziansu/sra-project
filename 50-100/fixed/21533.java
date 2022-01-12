protected org.jspresso.framework.application.frontend.command.remote.RemoteMessageCommand createErrorMessageCommand() {
    org.jspresso.framework.view.IIconFactory<org.jspresso.framework.gui.remote.RIcon> iconFactory = getFrontendController().getViewFactory().getIconFactory();
    org.jspresso.framework.application.frontend.command.remote.RemoteMessageCommand messageCommand = new org.jspresso.framework.application.frontend.command.remote.RemoteMessageCommand();
    messageCommand.setTitle(getFrontendController().getTranslation("error", getFrontendController().getLocale()));
    messageCommand.setTitleIcon(iconFactory.getErrorIcon(iconFactory.getTinyIconSize()));
    messageCommand.setMessageIcon(iconFactory.getErrorIcon(iconFactory.getLargeIconSize()));
    return messageCommand;
}