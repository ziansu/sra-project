protected void onPostSuccess(org.apache.wicket.ajax.AjaxRequestTarget target) {
    replace(getMainComponent(com.evolveum.midpoint.web.component.AsyncUpdatePanel.ID_BODY));
    target.add(this);
}