@java.lang.Override
public void save(com.raizlabs.android.dbflow.structure.database.DatabaseWrapper databaseWrapper) {
    super.save(databaseWrapper);
    if ((rounds) != null) {
        com.raizlabs.android.dbflow.sql.language.SQLite.delete(de.dreier.mytargets.shared.models.db.RoundTemplate.class).where(RoundTemplate_Table.standardRound.eq(id)).execute(databaseWrapper);
    }
    for (de.dreier.mytargets.shared.models.db.RoundTemplate s : getRounds()) {
        s.standardRound = id;
        s.save(databaseWrapper);
    }
}