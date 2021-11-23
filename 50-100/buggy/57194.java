public void setup_controllers() {
    drag_controller = new org.ganza.repo.controller.DragController(repo, repo_view);
    repo_view.setDragable(true);
    repo_view.setDragController(drag_controller);
    click_controller = new org.ganza.repo.controller.ClickController(repo, repo_view);
    repo_view.setClickController(click_controller);
    exit_controller.setRepo(repo);
    popup_controller.setRepo(repo);
    popup_controller.setClickController(click_controller);
}