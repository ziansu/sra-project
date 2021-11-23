@java.lang.Override
public void onCompleted() {
    android.util.Log.d("TCR", "onCompleted: got the list ");
    petList.sortPetList();
    while (!(org.greenrobot.eventbus.EventBus.getDefault().hasSubscriberForEvent(com.toddburgessmedia.torontocatrescue.model.PetListModel.PetListMessage.class))) {
        android.util.Log.d("TCR", "onCompleted: we don't have a subscriber");
    } 
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.toddburgessmedia.torontocatrescue.model.PetListModel.PetListMessage(petList.getPetList()));
}