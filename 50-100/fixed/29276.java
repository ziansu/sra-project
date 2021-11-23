@android.support.annotation.NonNull
private com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems getPages() {
    com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems pages = new com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems(getActivity());
    for (org.unicef.rapidreg.forms.childcase.CaseSection section : sections) {
        java.lang.String[] values = section.getName().values().toArray(new java.lang.String[0]);
        pages.add(com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem.of(values[0], org.unicef.rapidreg.childcase.CaseRegisterFragment.class));
    }
    return pages;
}