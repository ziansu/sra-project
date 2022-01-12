@java.lang.Override
public void save() {
    super.save();
    if ((images) != null) {
        com.raizlabs.android.dbflow.sql.language.SQLite.delete(de.dreier.mytargets.shared.models.db.ArrowImage.class).where(ArrowImage_Table.arrow.eq(id)).execute();
        for (de.dreier.mytargets.shared.models.db.ArrowImage image : images) {
            image.arrowId = id;
            image.save();
        }
    }
}