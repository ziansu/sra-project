private boolean isTokenExistInCookies() {
    boolean exist = (com.google.gwt.user.client.Cookies.getCookie(Constants.COOKIE_TOKEN_NAME)) != null;
    com.epsm.gwtHibernateHello.client.presenter.PagePresenter.logger.finer((("Invoked: isTokenExistInCookies(), returned '" + exist) + "'."));
    return exist;
}