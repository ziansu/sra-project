@org.springframework.web.bind.annotation.RequestMapping(path = "AdminNewPlayer.do")
public org.springframework.web.servlet.ModelAndView newPlayer(org.springframework.web.servlet.ModelAndView mv, data.Player player, java.lang.Integer integerUserTypeId, javax.servlet.http.HttpSession session) {
    player.setUserType(new data.UserType(integerUserTypeId));
    dao.createPlayer(player);
    java.util.List<data.Player> players = dao.indexPlayers();
    mv.addObject("players", players);
    mv.setViewName("WEB-INF/views/admin/adminPlayer.jsp");
    return mv;
}