public void setData(java.util.List<com.despedo.rss_msrcedes.dto.NewsDTO> data) {
    this.data = data;
    storiesFragment.refreshData(data);
    favouritesFragment.refreshData(data);
    videoFragment.refreshData(data);
}