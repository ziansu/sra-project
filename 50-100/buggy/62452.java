@java.lang.Override
public java.lang.String getFilter(org.betarss.domain.Language language, org.betarss.domain.Quality quality) {
    java.lang.StringBuilder filter = new java.lang.StringBuilder();
    if (quality == (org.betarss.domain.Quality.HD720p)) {
        filter.append("!720p");
    }else
        if (quality == (org.betarss.domain.Quality.HD)) {
            filter.append("720p");
        }
    
    return filter.toString();
}