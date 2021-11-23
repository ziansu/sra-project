@java.lang.Override
protected void onSubmit(org.apache.wicket.ajax.AjaxRequestTarget target, org.apache.wicket.markup.html.form.Form<?> form) {
    try {
        java.lang.Thread.sleep(3000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}