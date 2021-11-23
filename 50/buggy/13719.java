@java.lang.Override
public void save() {
    get(abo.CATEGORY_GENERAL, "version", ABO.VERSION);
    super.save();
}