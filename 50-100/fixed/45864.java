private void init() {
    if (session.isPlatformAdmin()) {
        view = viewFactory.getAdminCourseVersionView();
        if ((view.getPresenter()) == null) {
            view.setPresenter(this);
            view.init();
        }
    }else {
        logger.warning(("Hey, only admins are allowed to see this! " + (this.getClass().getName())));
        placeController.goTo(defaultPlace);
    }
}