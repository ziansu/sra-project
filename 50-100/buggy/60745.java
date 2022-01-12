private void fetchReceiverUserFromServer() {
    com.dk.mensajero.Entities.User rUser = new com.dk.mensajero.Entities.User(this.receiverUserPhone, "0000");
    com.dk.mensajero.Service.Service serviceRequest = new com.dk.mensajero.Service.Service(this);
    serviceRequest.fetchUserDataInBackground(rUser, new com.dk.mensajero.Interfaces.GetUserCallback() {
        @java.lang.Override
        public void done(com.dk.mensajero.Entities.User returnedUser, boolean success, boolean check) {
            setReceiverUser(returnedUser);
        }
    }, false);
}