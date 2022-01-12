@org.jetbrains.annotations.Nullable
public io.github.eterverda.playless.common.Dist bestMyReplacement(io.github.eterverda.playless.common.Dist... candidates) {
    int bestVersionCode = versionCode;
    io.github.eterverda.playless.common.Dist bestDist = null;
    for (io.github.eterverda.playless.common.Dist candidate : candidates) {
        if (!(candidate.applicationId.equals(applicationId))) {
            continue;
        }
        if (!(matcher.isCompatible(candidate.filter))) {
            continue;
        }
        if ((candidate.version.versionCode) <= bestVersionCode) {
            continue;
        }
        bestDist = candidate;
    }
    return bestDist;
}