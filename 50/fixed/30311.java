public void delete(no.mesan.model.User user) {
    if ((logDao.undo(user.getId())) > 0)
        no.mesan.websocket.LogUpdate.updateClients();
    
}