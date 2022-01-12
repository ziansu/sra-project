@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    for (com.firebase.client.DataSnapshot actionSnapshot : snapshot.getChildren()) {
        ru.spbau.mit.starlab.financialassistant.MainActivity.LastActions action = actionSnapshot.getValue(MainActivity.LastActions.class);
        categoryList.add(action.getCategoryLA());
        nameList.add(action.getNameLA());
        sumList.add(action.getSumLA());
    }
    done.countDown();
}