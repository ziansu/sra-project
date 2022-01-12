@android.support.annotation.Nullable
@java.lang.Override
protected ru.buepl.mobile.application.data.Application collectApplicationDataToSave() {
    ru.buepl.mobile.application.data.professional_development.ApplicationType applicationType = ru.buepl.mobile.application.data.professional_development.ApplicationType.builder().course(proDevApplicationFor).level(level).build();
    ru.buepl.mobile.application.data.Application application = ru.buepl.mobile.application.data.firebase.FirebaseHelper.getInstance().getApplication();
    application.getProfessionalDevelopmentApplication().setApplicationType(applicationType);
    return application;
}