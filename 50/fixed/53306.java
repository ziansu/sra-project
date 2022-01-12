public void reloadAllSports() {
    clear();
    addAll(com.jtcode.sports.Repository.getInstance());
    notifyDataSetChanged();
}