@java.lang.Override
public de.knoobie.project.fuko.database.domain.Artist getORadd(de.knoobie.project.fuko.database.domain.Artist source) {
    de.knoobie.project.fuko.database.domain.Artist realArtist = findBy(source.getVgmdbID());
    if (realArtist == null) {
        database.update(source);
        realArtist = findBy(source.getVgmdbID());
    }
    return realArtist;
}