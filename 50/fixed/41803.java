@java.lang.Override
public void navigationChanged(com.willshex.blogwt.client.controller.NavigationController.Stack previous, com.willshex.blogwt.client.controller.NavigationController.Stack current) {
    if (PageType.LogoutPageType.equals(current.getPage())) {
        com.willshex.blogwt.client.controller.SessionController.get().logout();
    }
    refresh();
}