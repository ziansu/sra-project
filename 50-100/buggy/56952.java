public void getConversations() {
    fiesta.hevs.ch.myapplication.ConversationListEndPointsAsyncTask cLAT = new fiesta.hevs.ch.myapplication.ConversationListEndPointsAsyncTask(this);
    cLAT.setType(this.LIST);
    cLAT.setDevice_id_1(android_id);
    cLAT.setDevice_id_2(other_device_id);
    if ((transport_id) != 0) {
        android.util.Log.d("transport_id", java.lang.String.valueOf(transport_id));
        cLAT.setFestival_transport_id(transport_id);
    }
    cLAT.execute();
}