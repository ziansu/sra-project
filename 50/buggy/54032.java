public void loadState(org.clarent.ivyidea.config.model.IvyIdeaProjectSettings state) {
    if (state == null) {
        state = new org.clarent.ivyidea.config.model.IvyIdeaProjectSettings();
    }
    com.intellij.util.xmlb.XmlSerializerUtil.copyBean(state, this.getState());
}