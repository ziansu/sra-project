private void executeCleaning() {
    java.util.List<com.tech.models.entities.Message> messageList = MS.getAllMessages();
    for (com.tech.models.entities.Message vLookUp : messageList) {
        java.util.Date deletionDate = new java.util.Date(((vLookUp.getDate().getTime()) + ((vLookUp.getTtl()) * (minuteInMillis))));
        if (deletionDate.after(new java.util.Date())) {
            MS.delete(vLookUp);
        }
    }
}