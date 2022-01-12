@java.lang.Override
protected void publishResults(java.lang.CharSequence charSequence, com.door43.translationstudio.newui.newtranslation.FilterResults filterResults) {
    java.util.List<com.door43.translationstudio.core.ProjectCategory> filteredProjects = ((java.util.List<com.door43.translationstudio.core.ProjectCategory>) (filterResults.values));
    if (filteredProjects != null) {
        mFilteredCategories = filteredProjects.toArray(new com.door43.translationstudio.core.ProjectCategory[filterResults.count]);
    }else {
        mFilteredCategories = new com.door43.translationstudio.core.ProjectCategory[0];
    }
    notifyDataSetChanged();
}