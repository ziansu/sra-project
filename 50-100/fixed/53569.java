@java.lang.Override
public void buildContent() {
    java.util.Collection<java.util.ArrayList<engine.api.IData>> collectionSet = getAllData().values();
    for (java.util.Iterator<java.util.ArrayList<engine.api.IData>> iterator = collectionSet.iterator(); iterator.hasNext();) {
        java.util.ArrayList<engine.api.IData> dataList = iterator.next();
        engine.core.factories.AbstractFactory.getFactory(engine.core.factories.DataFactory.class).queueResourcesPush(dataList.get(0).getClass(), dataList);
    }
}