@dagger.Provides
com.david.todo.presenter.TodoListPresenter provideTodoListPresenter(com.david.todo.repository.DataRepository dataRepository) {
    if ((_activity) instanceof com.david.todo.view.TodoListActivity) {
        return new com.david.todo.presenter.TodoListPresenter(((com.david.todo.view.TodoListActivity) (_activity)), new com.david.todo.service.TaskService(dataRepository));
    }else
        if ((_activity) instanceof com.david.todo.view.AddItemActivity) {
            return new com.david.todo.presenter.TodoListPresenter(((com.david.todo.view.AddItemActivity) (_activity)), new com.david.todo.service.TaskService(dataRepository));
        }
    
    return null;
}