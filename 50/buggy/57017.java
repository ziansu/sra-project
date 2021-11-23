@java.lang.Override
public void onCommit() {
    data.peopleOrder = result.order;
    data.touchPeopleOrder();
    storage.commit();
    data.testPeopleOrder();
}