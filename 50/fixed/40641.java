public void clickCreateDataBase(android.view.View v) {
    edu.byui.cs246.project.DataBaseCreator creator = new edu.byui.cs246.project.DataBaseCreator(db);
    if (creator != null) {
        creator.create();
    }
}