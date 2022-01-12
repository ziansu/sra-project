@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if ((currentPage) == (com.maksl5.bl_hunt.custom_ui.FragmentLayoutManager.PAGE_FOUND_DEVICES))
        com.maksl5.bl_hunt.custom_ui.fragment.FoundDevicesLayout.filterFoundDevices(newText, bhApp);
    
    if ((currentPage) == (com.maksl5.bl_hunt.custom_ui.FragmentLayoutManager.PAGE_LEADERBOARD)) {
        if ((com.maksl5.bl_hunt.custom_ui.fragment.LeaderboardLayout.currentSelectedTab) == 1) {
            com.maksl5.bl_hunt.custom_ui.fragment.LeaderboardLayout.filterLeaderboard(newText, bhApp);
        }else {
            com.maksl5.bl_hunt.custom_ui.fragment.WeeklyLeaderboardLayout.filterLeaderboard(newText, bhApp);
        }
    }
    return false;
}