@dagger.Provides
@org.hisp.dhis.android.eventcapture.PerUser
public org.hisp.dhis.android.eventcapture.presenters.SelectorPresenter providesSelectorPresenter(@javax.annotation.Nullable
org.hisp.dhis.client.sdk.android.organisationunit.UserOrganisationUnitInteractor userOrganisationUnitInteractor, @javax.annotation.Nullable
org.hisp.dhis.client.sdk.android.program.UserProgramInteractor userProgramInteractor, @javax.annotation.Nullable
org.hisp.dhis.client.sdk.android.program.ProgramStageInteractor programStageInteractor, @javax.annotation.Nullable
org.hisp.dhis.client.sdk.android.program.ProgramStageDataElementInteractor programStageDataElementInteractor, @javax.annotation.Nullable
org.hisp.dhis.client.sdk.android.event.EventInteractor eventInteractor, org.hisp.dhis.android.eventcapture.SessionPreferences sessionPreferences, org.hisp.dhis.client.sdk.ui.SyncDateWrapper syncDateWrapper, org.hisp.dhis.android.eventcapture.model.SyncWrapper syncWrapper, org.hisp.dhis.client.sdk.utils.Logger logger) {
    return new org.hisp.dhis.android.eventcapture.presenters.SelectorPresenterImpl(userOrganisationUnitInteractor, userProgramInteractor, programStageInteractor, programStageDataElementInteractor, eventInteractor, sessionPreferences, syncDateWrapper, syncWrapper, logger);
}