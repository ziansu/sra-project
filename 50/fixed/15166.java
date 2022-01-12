private void shake(org.apache.wicket.ajax.AjaxRequestTarget target) {
    target.appendJavaScript(com.googlecode.wicket.jquery.ui.effect.JQueryEffectBehavior.toString(("#" + (getMarkupId())), "shake"));
}