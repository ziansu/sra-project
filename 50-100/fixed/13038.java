private static org.yamj.core.database.model.type.JobType retrieveJobType(java.lang.String department) {
    switch (department.toLowerCase()) {
        case "writing" :
            return org.yamj.core.database.model.type.JobType.WRITER;
        case "directing" :
            return org.yamj.core.database.model.type.JobType.DIRECTOR;
        case "production" :
            return org.yamj.core.database.model.type.JobType.PRODUCER;
        case "sound" :
            return org.yamj.core.database.model.type.JobType.SOUND;
        case "camera" :
            return org.yamj.core.database.model.type.JobType.CAMERA;
        case "art" :
            return org.yamj.core.database.model.type.JobType.ART;
        case "editing" :
            return org.yamj.core.database.model.type.JobType.EDITING;
        case "costume & make-up" :
            return org.yamj.core.database.model.type.JobType.COSTUME_MAKEUP;
        case "crew" :
            return org.yamj.core.database.model.type.JobType.CREW;
        case "visual effects" :
            return org.yamj.core.database.model.type.JobType.EFFECTS;
        case "lighting" :
            return org.yamj.core.database.model.type.JobType.LIGHTING;
        default :
            org.yamj.core.service.metadata.online.TheMovieDbScanner.LOG.debug("Unknown department '{}'", department);
            return org.yamj.core.database.model.type.JobType.UNKNOWN;
    }
}