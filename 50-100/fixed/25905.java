@java.lang.Override
public void run() {
    final java.util.List<codng.hgx.ChangeSet> changeSets = cache.get();
    codng.hgx.Cache.saveHistory(id, changeSets);
    codng.hgx.Cache.saveLastRevision(id, codng.hgx.ChangeSet.last(changeSets).id.seqNo);
    java.lang.System.out.println("Cache updated.");
}