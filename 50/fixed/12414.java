@java.lang.Override
public void onSectionsLoaded(java.util.ArrayList<com.nmakademija.nmaakademija.entity.Section> sections) {
    if (isAdded()) {
        setSectionsAdapter(sections);
        loadUsers(null);
    }
}