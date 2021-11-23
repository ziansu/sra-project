@java.lang.Override
public void restoreFromBundle(com.watabou.utils.Bundle bundle) {
    levelTemplates = new java.util.ArrayList<com.dit599.customPD.levels.template.LevelTemplate>(com.dit599.customPD.levels.template.DungeonTemplate.MAX_DEPTH);
    levelTemplates.addAll(((java.util.Collection<? extends com.dit599.customPD.levels.template.LevelTemplate>) (bundle.getCollection("levelTemplates"))));
    if (((name) == null) || (name.equals(""))) {
        name = bundle.getString("templateName");
    }
    android.util.Log.d("DTRESTORE", ((levelTemplates.size()) + ""));
}