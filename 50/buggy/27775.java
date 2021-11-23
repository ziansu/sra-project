@java.lang.Override
public void execute(org.springframework.ui.Model model) {
    com.omega.board.dao.BDao dao = new com.omega.board.dao.BDao();
    java.util.ArrayList<com.omega.board.dto.BDto> dtos = dao.list();
    model.addAttribute("list", dtos);
}