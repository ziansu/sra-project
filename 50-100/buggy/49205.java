@java.lang.Override
public void onSuccess(org.ednovo.gooru.application.shared.model.content.ClasspageDo result) {
    classpageDo = result;
    getView().setCourseData(classpageDo);
    setCheckClassVisiblity(classpageDo);
    studentClassLearningMapPresenter.setClasspageDo(classpageDo);
    studentClassReportPresenter.setClasspageDo(classpageDo);
    if ((result.getCourseGooruOid()) == null) {
        getView().setProgressBarVisibility(false);
    }else {
        getView().setProgressBarVisibility(true);
    }
    loadNavigationPage();
}