private org.adaptlab.chpir.android.participanttracker.models.ParticipantType getParticipantType() {
    int participantTypeId = getArguments().getInt(org.adaptlab.chpir.android.participanttracker.ParticipantListActivity.ParticipantListFragment.ARG_SECTION_NUMBER, 0);
    return org.adaptlab.chpir.android.participanttracker.models.ParticipantType.getAll().get(participantTypeId);
}