public java.lang.String editRequest() {
    if ((selectedRequest.isExecuted()) == true) {
        selectedRequest.setFinished(new java.util.Date());
    }else {
        selectedRequest.setFinished(null);
        selectedRequest.setAssignee(null);
    }
    requestService.updateRequest(selectedRequest);
    return (javax.faces.context.FacesContext.getCurrentInstance().getViewRoot().getViewId()) + "?faces-redirect=true&includeViewParams=true";
}