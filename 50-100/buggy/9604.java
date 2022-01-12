@java.lang.Override
public boolean onCreateActionMode(com.actionbarsherlock.view.ActionMode mode, com.actionbarsherlock.view.Menu menu) {
    mode.setTitle(R.string.menu_restriction);
    super.onCreateActionMode(mode, menu);
    logic.addSelectedRelationWay(toWay);
    de.blau.android.osm.Relation restriction = logic.createRestriction(fromWay, viaElement, toWay, ((fromWay) == (toWay) ? de.blau.android.easyedit.EasyEditManager.RestrictionToElementActionModeCallback.NO_U_TURN_VALUE : null));
    android.util.Log.i("EasyEdit", "Created restriction");
    main.performTagEdit(restriction, de.blau.android.easyedit.EasyEditManager.RestrictionToElementActionModeCallback.RESTRICTION_TAG, false);
    main.startActionMode(new de.blau.android.easyedit.EasyEditManager.RelationSelectionActionModeCallback(restriction));
    return false;
}