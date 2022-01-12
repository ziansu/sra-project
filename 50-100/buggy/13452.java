public java.lang.String getErrorResource() {
    if ((validFormat) != null) {
        return org.keynote.godtools.renderer.crureader.bo.GPage.RenderHelpers.RenderSingleton.getInstance().getAppConfig().getFollowupModalInputValidGeneric();
    }else
        if ((type) == (org.keynote.godtools.renderer.crureader.bo.GPage.GInputField.InputFieldType.email)) {
            return org.keynote.godtools.renderer.crureader.bo.GPage.RenderHelpers.RenderSingleton.getInstance().getAppConfig().getFollowupModalInputValidGeneric();
        }else {
            return "Invalid Error Resource";
        }
    
}