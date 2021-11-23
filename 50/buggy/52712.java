@java.lang.Override
public void onNext(java.util.List<java.lang.Integer> integers) {
    mCardAdapter.addData(new com.dd7.yahn.rest.client.model.Item(integers.get(0)));
}