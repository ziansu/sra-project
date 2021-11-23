public void checkJoin(java.lang.String id, java.lang.String password, java.lang.String checkPassword) {
    if (password.equals(checkPassword)) {
        com.project.snake.database.SnakeDTO data = new com.project.snake.database.SnakeDTO("join", id, password, 0, 0, 0, 0);
        data = network.sendData(data);
        if (data != null) {
            view_ctr.joinView(data.getStatus());
            return ;
        }
    }
    view_ctr.joinView("joinno");
}