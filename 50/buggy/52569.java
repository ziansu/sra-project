@com.fasterxml.jackson.annotation.JsonIgnore
public edu.illinois.library.cantaloupe.image.Format getSourceFormat() {
    if ((mediaType) != null) {
        new edu.illinois.library.cantaloupe.image.MediaType(mediaType).toFormat();
    }
    return Format.UNKNOWN;
}