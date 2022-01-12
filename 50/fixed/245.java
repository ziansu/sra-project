@javax.annotation.PostConstruct
public void init() {
    org.projectforge.business.user.I18nHelper.setI18NService(this);
    loadResourceBundles();
}