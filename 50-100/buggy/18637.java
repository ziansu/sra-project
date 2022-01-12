@com.raizlabs.android.dbflow.annotation.OneToMany(methods = { OneToMany.Method.DELETE }, variableName = "images")
public java.util.List<de.dreier.mytargets.shared.models.db.ArrowImage> getImages() {
    if (((images) == null) || (images.isEmpty())) {
        images = com.raizlabs.android.dbflow.sql.language.SQLite.select().from(de.dreier.mytargets.shared.models.db.ArrowImage.class).where(ArrowImage_Table.arrow.eq(id)).queryList();
    }
    return images;
}