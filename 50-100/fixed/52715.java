@java.lang.Override
public boolean enabled() {
    if (true) {
        return true;
    }
    return ((application.configuration().keys().contains(plugins.MailerPlugin.SMTP_HOST_NAME)) && (application.configuration().keys().contains(plugins.MailerPlugin.SMTP_AUTH_USER))) && (application.configuration().keys().contains(plugins.MailerPlugin.SMTP_AUTH_PWD));
}