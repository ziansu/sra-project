public java.lang.String getErrorResource() {
    if ((validFormat) != null) {
        return java.lang.String.format(org.keynote.godtools.renderer.crureader.bo.GPage.RenderHelpers.RenderSingleton.getInstance().getAppConfig().getFollowupModalInputValidGeneric(), name.toUpperCase());
    }else
        if ((type) == (org.keynote.godtools.renderer.crureader.bo.GPage.GInputField.InputFieldType.email)) {
            return java.lang.String.format(org.keynote.godtools.renderer.crureader.bo.GPage.RenderHelpers.RenderSingleton.getInstance().getAppConfig().getFollowupModalInputValidGeneric(), name.toUpperCase());
        }else {
            return "Invalid Error Resource";
        }
    
}