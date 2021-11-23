@java.lang.Override
public void fetchUsersData(java.util.List<id.semmi.pickme.team.addteam.UserChip> userChips) {
    if ((userChips != null) || ((userChips.size()) != 0)) {
        chipsInput.setFilterableList(userChips);
    }
}