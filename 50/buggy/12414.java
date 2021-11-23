@java.lang.Override
public void onSectionsLoaded(java.util.ArrayList<com.nmakademija.nmaakademija.entity.Section> sections) {
    if (isAdded()) {
        setSectionsAdapter(sections);
        java.lang.Integer sectionId = com.nmakademija.nmaakademija.fragment.AcademicsFragment.getSectionId(sections, sectionSelectedPosition);
        loadUsers(sectionId);
    }
}