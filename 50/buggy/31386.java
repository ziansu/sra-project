@java.lang.Override
public void onVersion(au.id.villar.rir.VersionLine version) {
    (counter.count)++;
    (counter.versionCount)++;
    java.lang.System.out.println(("Version line: " + (version.registry())));
}