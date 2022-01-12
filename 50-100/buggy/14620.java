@java.lang.Override
protected void publishResults(java.lang.CharSequence charSequence, com.door43.translationstudio.newui.newtranslation.FilterResults filterResults) {
    java.util.List<com.door43.translationstudio.core.ProjectCategory> filteredProjects = ((java.util.List<com.door43.translationstudio.core.ProjectCategory>) (filterResults.values));
    if ((charSequence != null) && ((charSequence.length()) > 0)) {
        com.door43.translationstudio.newui.newtranslation.ProjectCategoryAdapter.sortProjectCategories(filteredProjects, charSequence);
    }
    mFilteredCategories = filteredProjects.toArray(new com.door43.translationstudio.core.ProjectCategory[filterResults.count]);
    notifyDataSetChanged();
}