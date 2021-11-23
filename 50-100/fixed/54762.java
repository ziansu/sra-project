private io.github.bonigarcia.wdm.GitHubApi getVersion(io.github.bonigarcia.wdm.GitHubApi[] releaseArray, java.lang.String version) {
    io.github.bonigarcia.wdm.GitHubApi out = null;
    for (io.github.bonigarcia.wdm.GitHubApi release : releaseArray) {
        if (release.getName().contains(version)) {
            out = release;
            break;
        }
    }
    return out;
}