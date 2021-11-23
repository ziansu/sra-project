public static org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment newInstanceWithEnrollment(java.lang.String unitId, java.lang.String programId, java.lang.String programStageId, long enrollmentId, long eventId) {
    org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment fragment = new org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment.ORG_UNIT_ID, unitId);
    args.putString(org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment.PROGRAM_ID, programId);
    args.putString(org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment.PROGRAM_STAGE_ID, programStageId);
    args.putLong(org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment.EVENT_ID, eventId);
    args.putLong(org.hisp.dhis.android.sdk.ui.fragments.eventdataentry.EventDataEntryFragment.ENROLLMENT_ID, enrollmentId);
    fragment.setArguments(args);
    return fragment;
}