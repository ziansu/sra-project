public void getButtons() {
    unselectedSections = com.example.sourcewall.db.GroupHelper.getUnselectedGroups();
    java.util.ArrayList<com.example.sourcewall.commonview.shuffle.MovableButton> unselectedButtons = new java.util.ArrayList<>();
    for (int i = 0; i < (unselectedSections.size()); i++) {
        com.example.sourcewall.db.gen.MyGroup section = unselectedSections.get(i);
        com.example.sourcewall.commonview.shuffle.GroupMovableButton button = new com.example.sourcewall.commonview.shuffle.GroupMovableButton(getActivity());
        button.setSection(section);
        unselectedButtons.add(button);
    }
    deskSimple.setButtons(unselectedButtons);
}