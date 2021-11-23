public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.String team_name = player.get_team();
    nbaquery.presentation2.info.Team created_team = new nbaquery.presentation2.info.Team(nbaquery.presentation2.panel.PanelSet.get_team_service().searchForOneTeam(team_name));
    nbaquery.presentation2.panel.PanelSet.create_detailed_panel(created_team);
}