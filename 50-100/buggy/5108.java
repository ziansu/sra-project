public void addEvent(javax.faces.event.ActionEvent actionEvent) {
    if (timeTableManager.hasCoveringTimeTable(worker.getId(), event.getTt())) {
        addMessage(new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, "Hiba!", "Nem lehet beosztás átfedő!"));
        return ;
    }
    if ((event.getId()) == null) {
        timeTableManager.addTimeTableToWorker(worker.getId(), event.getTt());
    }else {
        timeTableManager.saveTimeTable(event.getTt());
    }
}