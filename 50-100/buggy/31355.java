@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.util.ArrayList<com.serp1983.nokiacomposer.domain.RingtoneVM> tempData = new java.util.ArrayList<>();
    for (com.google.firebase.database.DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
        com.serp1983.nokiacomposer.domain.RingtoneDTO dto = postSnapshot.getValue(com.serp1983.nokiacomposer.domain.RingtoneDTO.class);
        tempData.add(new com.serp1983.nokiacomposer.domain.RingtoneVM(postSnapshot.getKey(), dto));
    }
    java.util.Collections.sort(tempData, RingtoneVM.COMPARE_BY_NEW);
    com.serp1983.nokiacomposer.logic.FirebaseDatabaseService.data = new android.databinding.ObservableArrayList();
    com.serp1983.nokiacomposer.logic.FirebaseDatabaseService.data.addAll(tempData);
}