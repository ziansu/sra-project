@java.lang.Override
public de.knoobie.project.fuko.database.domain.Artist getORadd(de.knoobie.project.fuko.database.domain.Artist source) {
    de.knoobie.project.fuko.database.domain.Artist realArtist = database.getArtistService().findBy(source.getVgmdbID());
    if (realArtist == null) {
        database.getArtistService().add(source);
        realArtist = database.getArtistService().findBy(source.getVgmdbID());
    }
    return realArtist;
}