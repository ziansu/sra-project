public nfl.season.menu.MatchupMenu getMatchupMenu() {
    nfl.season.menu.SubMenu subMenu = subMenus[0];
    nfl.season.menu.MatchupMenu matchupMenu = null;
    if ((subMenu != null) && (subMenu instanceof nfl.season.menu.MatchupMenu)) {
        matchupMenu = ((nfl.season.menu.MatchupMenu) (subMenu));
    }
    return matchupMenu;
}