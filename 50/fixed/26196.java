public static void save(android.support.v4.app.FragmentActivity source) {
    com.woodblockwithoutco.beretained.FieldsRetainer<android.support.v4.app.FragmentActivity> retainer = com.woodblockwithoutco.beretained.BeRetained.findFieldsRetainer(source.getClass());
    if (retainer != null) {
        retainer.save(source);
    }
}