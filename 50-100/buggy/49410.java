public final void parseTXT(final java.lang.String text) {
    final de.dfki.vsm.model.scenescript.SceneScript script = de.dfki.vsm.model.scenescript.ScriptParser.run("", text, false, true, false, false);
    if (script != null) {
        mEntityList = script.getEntityList();
        initObjectLists();
        initLangMap();
        initGroupMap();
    }else {
        mEntityList.clear();
        mSceneList.clear();
        mCommentList.clear();
        mGroupMap.clear();
        mLangMap.clear();
    }
}