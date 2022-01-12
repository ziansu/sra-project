@java.lang.Override
public java.lang.String execute(ua.fantotsy.controllers.ISessionRequestWrapper wrapper) throws java.io.IOException, javax.servlet.ServletException {
    if (isLogoutPressed(wrapper)) {
        return wrapper.sessionInvalidate();
    }else {
        if (!(isLocaleAlreadyChosen(wrapper))) {
            setDefaultLocale(wrapper);
        }
        if (isLoginIconPressed(wrapper)) {
            setChosenLocale(wrapper);
        }
        return ua.fantotsy.utils.UrlGetter.getInstance().getUrl(UrlGetter.START_PAGE);
    }
}