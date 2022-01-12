@android.support.annotation.Nullable
@java.lang.Override
public java.util.List<com.openconference.model.Speaker> speakers() {
    if ((speakers) == null) {
        if ((speakerIds) == null) {
            return null;
        }
        speakers = new java.util.ArrayList<>(speakerIds.size());
        for (java.lang.String speakerId : speakerIds) {
            speakers.add(new de.droidcon.model.backend.DroidconBerlinSpeaker(speakerId));
        }
    }
    return speakers;
}